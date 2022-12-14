package com.spingaop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UsesAccessAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before("execution(* com.spingaop.business.*.*(..))")
	public void before(JoinPoint joinPoint) {
		logger.info("Check for user access");
		logger.info("Allowed Execution for {}",joinPoint);
	}
}
