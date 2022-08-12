package com.springexample.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringExampleDaoApplication {

	public static void main(String[] args) {

		
	 Logger LOGGER = LoggerFactory.getLogger(SpringExampleDaoApplication.class);
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringExampleDaoApplication.class,
				args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
	 LOGGER.info("{}", personDAO);
	 LOGGER.info("{}", personDAO.getJdbcConnection());
	 LOGGER.info("{}", personDAO);
	  
	 LOGGER.info("{}", personDAO1);
	 LOGGER.info("{}", personDAO1.getJdbcConnection());
		
	}

}
