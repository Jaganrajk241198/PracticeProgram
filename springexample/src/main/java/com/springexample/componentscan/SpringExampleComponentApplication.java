package com.springexample.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringExampleComponentApplication {

	public static void main(String[] args) {

		
	 Logger LOGGER = LoggerFactory.getLogger(SpringExampleComponentApplication.class);
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringExampleComponentApplication.class,
				args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);
		ComponentDAO componentDAO1 = applicationContext.getBean(ComponentDAO.class);
	 LOGGER.info("{}", componentDAO);
	 LOGGER.info("{}", componentDAO.getComponentJdbcConnection());
	 LOGGER.info("{}", componentDAO);
	  
	 LOGGER.info("{}", componentDAO1);
	 LOGGER.info("{}", componentDAO1.getComponentJdbcConnection());
		
	}

}
