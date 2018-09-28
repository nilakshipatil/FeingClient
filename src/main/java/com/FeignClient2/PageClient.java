package com.FeignClient2;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient(name="pagedemo",url="https://reqres.in/")
public interface PageClient {
	
	@RequestMapping(method=RequestMethod.GET,value="/api/users?page=1")
	public Page getpage();
	
}
