package com.spingaop.afteraspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfterAspect {

private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@AfterReturning(value = "execution(* com.spingaop.business.*.*(..))",returning = "result")
	public void afterReturning(JoinPoint joinPoint,Object result) {
		logger.info("{} returned with the value {}",joinPoint,result);
	}
	
	@After("execution(* com.spingaop.business.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution {}", joinPoint);
	}
}
	
	

