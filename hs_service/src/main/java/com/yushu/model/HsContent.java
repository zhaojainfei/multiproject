package com.yushu.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "hs_content")
public class HsContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String url;

    private Integer depth;

    @Column(name = "crawledTime")
    private Date crawledtime;

    @Column(name = "spiderName")
    private String spidername;

    private String referer;

    @Column(name = "outerHtml")
    private String outerhtml;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return depth
     */
    public Integer getDepth() {
        return depth;
    }

    /**
     * @param depth
     */
    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    /**
     * @return crawledTime
     */
    public Date getCrawledtime() {
        return crawledtime;
    }

    /**
     * @param crawledtime
     */
    public void setCrawledtime(Date crawledtime) {
        this.crawledtime = crawledtime;
    }

    /**
     * @return spiderName
     */
    public String getSpidername() {
        return spidername;
    }

    /**
     * @param spidername
     */
    public void setSpidername(String spidername) {
        this.spidername = spidername;
    }

    /**
     * @return referer
     */
    public String getReferer() {
        return referer;
    }

    /**
     * @param referer
     */
    public void setReferer(String referer) {
        this.referer = referer;
    }

    /**
     * @return outerHtml
     */
    public String getOuterhtml() {
        return outerhtml;
    }

    /**
     * @param outerhtml
     */
    public void setOuterhtml(String outerhtml) {
        this.outerhtml = outerhtml;
    }
}