package com.codebind.oi.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebind.oi.microservices.bean.LimiteConfiguration;

@RestController
public class LimitesConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	
	@GetMapping("/limits")
	public LimiteConfiguration retriveLimitsFromConfiguration() {
		 //LimiteConfiguration limiteConfiguration = 
		 return new LimiteConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
