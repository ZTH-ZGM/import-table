package com.hua;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	
	
	public static int[] createFinonacci(int length) {
		if(length == 1) {
			return new int[] {1};
		}else if(length == 2){
			return new int[] {1, 1};
		}else if(length > 2){
			int[] fibonacci = new int[length];
			fibonacci[0] = 1;
			fibonacci[1] = 1;
			for(int i=2; i<length; i++) {
				fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
			}
			return fibonacci;
		}else {
			return new int[] {0};
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fibonacci = Fibonacci.createFinonacci(5);
		System.out.print("Fibonacci:");
		for(int num : fibonacci) {
			System.out.print(num+";");
		}	
	}

}
