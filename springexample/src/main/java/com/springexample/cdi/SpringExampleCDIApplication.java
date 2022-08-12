package com.springexample.cdi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringExampleCDIApplication {

	public static void main(String[] args) {

		
	 Logger LOGGER = LoggerFactory.getLogger(SpringExampleCDIApplication.class);
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringExampleCDIApplication.class,
				args);

		SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
		
	 LOGGER.info("{} DAO -{}", business, business.getSomeCDIDAO());
	}
     
}
