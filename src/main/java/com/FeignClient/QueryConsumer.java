package com.FeignClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class QueryConsumer {

	@Autowired
	private EmpClient empclient;
	
	public static void main(String[] args) {
		SpringApplication.run(QueryConsumer.class, args);
	}
	
	@Bean
	public String getemps(){
		System.out.println("get Employees:");
		empclient.list().forEach(e->System.out.println(e));
		return "success";
	}
	@Bean
	public String ins(){
		Emp e=new Emp();
		System.out.println("insert Employees:");
		e.setEmpno(1168);
		e.seteName("Ganesh");
		e.setDept("Dept1");
		e.setSalary(10000);
		empclient.ins(e);
		return "success";
	}
}
