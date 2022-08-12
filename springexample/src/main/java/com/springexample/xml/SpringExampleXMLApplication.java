package com.springexample.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringExampleXMLApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger( SpringExampleXMLApplication.class);

	public static void main(String[] args) {

	try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
		
		XMLPersonDAO personDao = applicationContext.getBean(XMLPersonDAO.class);
		System.out.println(personDao);
		System.out.println(personDao.getXmlJdbcConnection());
		
		
	}
		 
			
			
			
	}

}
