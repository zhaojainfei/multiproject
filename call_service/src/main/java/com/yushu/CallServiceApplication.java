package com.yushu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
/**
 * 开启Feign
 * Fegin原理
 * @EnableFeignClients扫描所有@FeignClient类,然后实例化Service
 * 了解 -- Feign默认集成Ribbon，Ribbon采用轮询的方式调取服务列表
 */
@EnableFeignClients
// 开启熔断
@EnableCircuitBreaker
public class CallServiceApplication {
	/**
	 * Erueka消费者
	 * @LoadBalanced - 是一个负载均衡的注解
	 * RestTemplate底层 - HttpClient - URLConection
	 * @return
	 */
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(CallServiceApplication.class, args);
	}
}
