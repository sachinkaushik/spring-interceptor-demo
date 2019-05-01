package com.demo.interceptor.springinterceptordemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.demo.interceptor.springinterceptordemo.exception.InvalidHeaderException;

@Component
public class RequestHeaderInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		if(StringUtils.isEmpty(request.getHeader("student-token"))) {
			throw new InvalidHeaderException("Invalid request");
		}
		return super.preHandle(request, response, handler);
	}
}
