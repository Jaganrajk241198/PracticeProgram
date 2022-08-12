package com.mockitoexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessMockTest {

	@Test
	void testfindAllTheGreatestFromAlltheData() {
  
		DataService dataServicemock = mock(DataService.class);
		when(dataServicemock.retrieveAllData()).thenReturn(new int[] {56,24,55});
		
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServicemock);
		int result = businessImpl.findAllTheGreatestFromAlltheData();
          assertEquals(56,result);
	}
}
	

