package com.FeignClient;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="empdemo",url="http://localhost:8087/")
public interface EmpClient {

	@RequestMapping(method=RequestMethod.GET,value="/")
	public List<Emp> list();
	@RequestMapping(method=RequestMethod.POST)
	public Emp ins(Emp e);
	

}
