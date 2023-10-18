package com.example.app.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="DMS-SERVICE")
public interface dmsproxy {
	
	@GetMapping("/dms/test")
	String test();
}
