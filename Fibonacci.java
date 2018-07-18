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
		System.out.println("\n"+1234/1000 + ";" + 1234/100%10 + ";" + 1234/10%100%10 + ";" + 1234%1000%100%10);
		/*
		 *  吸血鬼数字是指位数为偶数的数字，可以有一对数字相乘而得到，而这对数字各包含乘积的一半位数的数字，
		 * 其中从最初的数字中选取的数字可以任意排序。
		 */
		System.out.println("4位数所有吸血鬼数字：");
		label:
		for(int i=1000; i<=9999; i++) {
			if(i%100 != 0) {
				//System.out.println(i);
				int[] num_arr = new int[] {i/1000, i/100%10, i/10%100%10, i%1000%100%10};
				int[] twonum_arr = new int[12];
				int index = 0;
				for(int j=0; j<num_arr.length; j++) {
					for(int k=3; k>j; k--) {
						//System.out.println(num_arr[j] + "---" + num_arr[k]);
						twonum_arr[index] = num_arr[j]*10 + num_arr[k];
						//System.out.println(twonum_arr[index]);
						index++;
						twonum_arr[index] = num_arr[k]*10 + num_arr[j];
						//System.out.println(twonum_arr[index]);
						index++;
					}
				}
				for(int x=0; x<twonum_arr.length; x++) {
					label2 :
					for(int y=0; y<twonum_arr.length; y++) {
						Map<Integer, Integer> map = new HashMap<>();
						map.put(twonum_arr[x]/10, twonum_arr[x]/10);
						map.put(twonum_arr[x]%10, twonum_arr[x]%10);
						map.put(twonum_arr[y]/10, twonum_arr[y]/10);
						map.put(twonum_arr[y]%10, twonum_arr[y]%10);
						
						for(int num : num_arr) {
							if(!map.containsKey(num)) {
								continue label2;
							}
						}
						if(i == (twonum_arr[x]*twonum_arr[y])) {
							System.out.println("吸血鬼数字"+i);
							System.out.println(twonum_arr[x] + " * " + twonum_arr[y]);
							continue label;
						}
					}
				}
			}
		}
		
	}

}
