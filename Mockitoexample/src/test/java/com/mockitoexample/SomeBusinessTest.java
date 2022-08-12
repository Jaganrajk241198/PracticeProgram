package com.mockitoexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessTest {

	@Test
	void testfindAllTheGreatestFromAlltheData() {

		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataserviceImp());
		int result = businessImpl.findAllTheGreatestFromAlltheData();
          assertEquals(56,result);
	}
}

class DataserviceImp implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {25,56,28};
	}
	
}
