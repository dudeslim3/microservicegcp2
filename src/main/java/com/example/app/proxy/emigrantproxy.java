package com.example.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="EMIGRANT-SERVICE")
public interface emigrantproxy {
	
	@GetMapping("/emigrant/testAPI")
	String testAPI();

}
