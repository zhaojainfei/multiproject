package com.yushu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.yushu.mapper")
public class GloryServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(GloryServiceApplication.class, args);
	}
}
