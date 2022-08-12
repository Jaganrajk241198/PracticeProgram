package com.functionProgra;

import java.util.Arrays;
import java.util.List;

public class Functional {

	
public static void main(String[] args) {
		
		printAllNumbersInList(Arrays.asList(12,5,41,12,22,12));

	}

public static void print(int num) {
	                                                 // while using method reference this print method is not needed.
	System.out.println(num);
}

	private static void printAllNumbersInList(List<Integer> numbers) {
		
		numbers.stream()
		       .forEach(Functional::print);                //forEach(System.out::println));
		
		
	}
}
