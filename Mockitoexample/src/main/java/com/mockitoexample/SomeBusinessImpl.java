package com.mockitoexample;

public class SomeBusinessImpl {

	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	int findAllTheGreatestFromAlltheData() {
		int[]data = dataService.retrieveAllData();
		 int greatest = Integer.MIN_VALUE;
		 
		 for(int value : data) {
			 if(value > greatest)
			 greatest = value;     //to find the maximum value.
			                         // to return the one value.
		 }
		

	
	 return greatest;
	}
}
	
	
	