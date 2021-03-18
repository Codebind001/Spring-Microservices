package com.codebind.oi.microservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebind.oi.microservices.bean.LimiteConfiguration;

@RestController
public class LimitesConfigurationController {
	
	@GetMapping("/limits")
	public LimiteConfiguration retriveLimitsFromConfiguration() {
		return new LimiteConfiguration(999,1);
	}

}
