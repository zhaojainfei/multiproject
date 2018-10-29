package com.yushu.config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}

/*
config server 使用教程
1.添加@EnableConfigServer
config server去拉取git上面所有的配置文件
2.访问方式:
		/{label}/{name}-{profiles}.yml 后缀可以随便访问
		http://localhost:8990/master/product-service-prod.properties
		master为分支名,product-service-prod.properties为文件名
*/