package com.yushu.common.utils;

import com.yushu.common.model.MailEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.URLDataSource;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class MailUtils {
    // qq企业邮箱帮助文档 - https://service.exmail.qq.com/cgi-bin/help?subtype=1&id=28&no=1000585
    private static final Logger logger = LoggerFactory.getLogger(MailUtils.class);

    public static String mailAccount = "zhaojianfei@aoji.cn";
    public static String mailPassword = "2691894sC3";

    // 发件人邮箱的 SMTP 服务器地址
    public static String mailSMTPHost = "smtp.exmail.qq.com";
    public static String transportProtocol = "smtp";

    public static String receiveMailAccount = "konglingji@aoji.cn";

    public void send(MailEntity mailEntity) {
        // 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();
        // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.transport.protocol", transportProtocol);
        // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.host", mailSMTPHost);
        // 需要请求认证
        props.setProperty("mail.smtp.auth", "true");

        // ssl访问
        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);

        // 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        // 设置为debug模式, 可以查看详细的发送 log
        session.setDebug(true);
        try {
            // 创建一封邮件
            MimeMessage message = createSimpleMessage(session, mailEntity);
            // 根据Session 获取邮件传输对象
            Transport transport = session.getTransport();
            transport.connect(mailAccount, mailPassword);
            // 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
            transport.sendMessage(message, message.getAllRecipients());
            // 关闭连接
            transport.close();
        } catch (Exception e) {
            logger.error("发送邮件失败:" + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * 创建简单的邮件
     *
     * @param session
     * @param mailEntity
     * @return
     */
    private MimeMessage createSimpleMessage(Session session, MailEntity mailEntity) {
        // 创建一封邮件
        MimeMessage message = new MimeMessage(session);
        try {
            // 设置发件人
            message.setFrom(new InternetAddress(mailEntity.getSendAccount(), mailEntity.getSendName(), "UTF-8"));
            // 设置收件人
            message.addRecipients(MimeMessage.RecipientType.TO, getAccounts(mailEntity.getReceiveAccounts()));
            // 设置抄送
            // message.setRecipient(MimeMessage.RecipientType.CC, new InternetAddress(receiveMailAccount, "杨赛星", "UTF-8"));
            // 设置邮件主题
            message.setSubject(mailEntity.getSubject(), "UTF-8");
            // 设置邮件正文
            message.setContent(mailEntity.getContent(), "text/html;charset=UTF-8");
            // 设置发件时间
            message.setSentDate(new Date());
            // 保存设置
            message.saveChanges();
        } catch (MessagingException e) {
            logger.error(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            logger.error(e.getMessage());
        }
        return message;
    }

    /**
     * 创建一封复杂邮件（文本+图片+附件）
     */
    private MimeMessage createMimeMessage(Session session, MailEntity mailEntity) throws Exception {
        // 1. 创建邮件对象
        MimeMessage message = new MimeMessage(session);

        // 2. From: 发件人
        message.setFrom(new InternetAddress(mailEntity.getSendAccount(), mailEntity.getSendName(), "UTF-8"));

        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
        message.addRecipients(MimeMessage.RecipientType.TO,getAccounts(mailEntity.getReceiveAccounts()));
        // 4. Subject: 邮件主题
        message.setSubject(mailEntity.getSubject(), "UTF-8");
        //5. 设置
        //整封邮件的MINE消息体
        MimeMultipart msgMultipart = new MimeMultipart("mixed");//混合的组合关系
        //设置邮件的MINE消息体
        message.setContent(msgMultipart);


        //正文内容
        MimeBodyPart content = new MimeBodyPart();
        //将正文、附件加入到MINE消息体中
        msgMultipart.addBodyPart(content);

        if(!(mailEntity.getAttachments()==null && mailEntity.getAttachments().size()==0)){
            for(int i=0;i<mailEntity.getAttachments().size();i++){
                String attachmentUrl=mailEntity.getAttachments().get(i);
                if(StringUtils.hasText(attachmentUrl)){
                    continue;
                }
                MimeBodyPart attachment = new MimeBodyPart();
                msgMultipart.addBodyPart(attachment);
                //附件
                DataSource dataSource=new URLDataSource(new URL(attachmentUrl));
                attachment.setDataHandler(new DataHandler(dataSource));
            }
        }


        //设置正文内容
        MimeMultipart bodyMultipart  = new MimeMultipart("related");
        //设置内容为正文
        content.setContent(bodyMultipart);
        //html代码部分
        MimeBodyPart htmlPart = new MimeBodyPart();
        //正文添加图片和html代码
        bodyMultipart.addBodyPart(htmlPart);
        htmlPart.setContent(mailEntity.getContent(),"text/html;charset=utf-8");
        //生成文件邮件
        message.saveChanges();
        //设置发件时间
        message.setSentDate(new Date());
        return  message;
    }

    /**
     * 获取账号地址
     *
     * @param receiveAccounts
     * @return
     * @throws AddressException
     */
    private InternetAddress[] getAccounts(List<String> receiveAccounts) throws AddressException {
        List<InternetAddress> addressList = new ArrayList<>(receiveAccounts.size());
        for (String receiveStr : receiveAccounts) {
            if (StringUtils.hasText(receiveStr)) {
                addressList.add(new InternetAddress(receiveStr));
            }
        }
        InternetAddress[] addresses = addressList.toArray(new InternetAddress[addressList.size()]);
        return addresses;
    }
}
