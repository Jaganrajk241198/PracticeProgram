package com.springexample;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	@Qualifier("quick")
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSearchfor) {

		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		return 3;
	}

	@PostConstruct
	public void postConstructor() {
		logger.info("PostConstruct");
	}

	@PreDestroy
	public void preDestory() {
		logger.info("PreDestory");
		
	}
}
