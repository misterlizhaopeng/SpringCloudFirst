package com.lp.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class MySelfRule {
	@Bean
	public IRule rule() {
		//return new RandomRule();
		//return new RandomRule_LP();
		return new RetryRule();
	}
}
