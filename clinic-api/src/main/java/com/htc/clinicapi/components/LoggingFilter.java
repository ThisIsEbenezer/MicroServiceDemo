package com.htc.clinicapi.components;


import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;



@Component
public class LoggingFilter extends ZuulFilter{

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}
//Filter Logic will be defined below method
	@Override
	public Object run() throws ZuulException {
		
		HttpServletRequest request=RequestContext.getCurrentContext().getRequest();	
		logger.info("request ={} request uri={}",request,request.getRequestURI());
		logger.info("Remote Host request={}",request.getRemoteHost());
	
		return null;
	}
	/*
	 * Defining When we need to Execute Filter
	 */

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

}
