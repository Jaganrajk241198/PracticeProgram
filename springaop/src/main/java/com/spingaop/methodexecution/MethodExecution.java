package com.spingaop.methodexecution;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MethodExecution {

private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around(value = "execution(* com.spingaop.business.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable  {
		long starttime = System.currentTimeMillis();
		
		joinPoint.proceed();
		
		
		long TimeTaken = System.currentTimeMillis();
		logger.info("{} returned with the value {}",joinPoint);
	}
	
}
