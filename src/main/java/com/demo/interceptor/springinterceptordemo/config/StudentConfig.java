package com.demo.interceptor.springinterceptordemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.demo.interceptor.springinterceptordemo.interceptor.RequestHeaderInterceptor;

@Configuration
public class StudentConfig implements WebMvcConfigurer{

	@Autowired
	public RequestHeaderInterceptor headerInterceptor;
	
	public  void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(headerInterceptor);
	}
}
