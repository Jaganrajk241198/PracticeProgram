package com.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringexampleApplication {

	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSortAlgorithm());   //quicksortalgorithm
		 //System.out.println(result);
		
		
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringexampleApplication.class, args);
		
	    BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	    
	    BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
	    
	    System.out.println(binarySearch);
	    System.out.println(binarySearch1);
		
	    int result = binarySearch.binarySearch(new int[]{2, 4,6},3);
        
	    System.out.println(result);	
	}

}
