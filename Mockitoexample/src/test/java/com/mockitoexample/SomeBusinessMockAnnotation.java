package com.mockitoexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockAnnotation {

	
	@Mock
	DataService dataServicemock;
    @InjectMocks	
    SomeBusinessImpl businessImpl;
    
	@Test
	void testfindAllTheGreatestFromAlltheData() {
  
		//DataService dataServicemock = mock(DataService.class);
		when(dataServicemock.retrieveAllData()).thenReturn(new int[] {56,24,55});
		
		
		//SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServicemock);
		int result = businessImpl.findAllTheGreatestFromAlltheData();
          assertEquals(56,result);
	}
}
	

