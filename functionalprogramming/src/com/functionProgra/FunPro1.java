package com.functionProgra;

import java.util.Arrays;
import java.util.List;

public class FunPro1 {

	public static void main(String[] args) {
		
		printAllNumbersInListStructures(Arrays.asList(12,5,41,12,22,12));

	}

	private static void printAllNumbersInListStructures(List<Integer> numbers) {
		//looping the numbers
		
		for(int number:numbers) {
			
			System.out.println(number);
		}
		
	}

}
