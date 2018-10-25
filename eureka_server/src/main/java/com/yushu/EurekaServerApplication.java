package com.yushu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
}
// 创建流程
// Eureka注册中心 - Cloud Discovery - Eureka Server
// 服务 - Cloud Discovery - Cloud Discovery;Web - Web
// 消费者 - Cloud Discovery - Cloud Discovery;Web - Web;Cloud Routing - Ribbon
// 网关 - Cloud Discovery - Cloud Discovery;Cloud Routing - Zuul
}
