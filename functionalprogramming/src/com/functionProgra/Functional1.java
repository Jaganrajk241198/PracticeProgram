package com.functionProgra;

import java.util.List;

public class Functional1 {
	public static void main(String[]args) {
	//printAllArrayNumber(Arrays.asList(14,56,47,25,53,22));
	//printEvenArrayNumber(Arrays.asList(14,56,47,25,53,22));
}
	private static void printAllArrayNumber(List<Integer>numbers) {
		for(int number:numbers) {
			
			System.out.println(number);
		}
		
	}
	private static boolean isEven(int number){
		return number%2==0;
		
	}
	
	/*private static void printEvenArrayNumber(List<Integer>numbers) {
		for(int number:numbers) {
			.filter(Functional::isEven);
			System.out.println(number);
		}
		*/
	}
	
