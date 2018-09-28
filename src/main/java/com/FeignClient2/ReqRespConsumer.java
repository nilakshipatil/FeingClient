package com.FeignClient2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import com.FeignClient.QueryConsumer;

import feign.RequestInterceptor;
import feign.RequestTemplate;

@SpringBootApplication
@EnableFeignClients
public class ReqRespConsumer {

	@Autowired
	PageClient pageclient;
	
	public static void main(String[] args) {
		SpringApplication.run(ReqRespConsumer.class, args);
	}
	
	/*@Bean
	public String getPages(){
		System.out.println("get Page:");
	    pageclient.getpage().toString();
		return "success";
	}*/
	
	@Bean
	public RequestInterceptor req(){
		return new RequestInterceptor(){
			@Override
			public void apply(RequestTemplate reqtemp){
				reqtemp.header("user-agent", "Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/69.0.3497.100 Safari/537.36");
			}
		};
	}
	
	@Bean
	public String checkEmp(){
		System.out.println("Get Details:");
		System.out.println(pageclient.getpage());
		return "ss";
	}
	
}
