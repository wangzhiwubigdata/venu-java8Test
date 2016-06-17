package cn.com.mx.Atest;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		//test7();
		//test8();
		test10();
	}
	
	
	public static void test7(){
		int[] arr = {1,3,4,5,6,79,2};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static void test8(){
		int[] arr = {1,3,4,5,6,79,2};
		Arrays.stream(arr).forEach(System.out::println);
	}
	public static void test9(){
		int[] arr = {1,3,4,5,6,79,2};
		System.out.println();
		Arrays.stream(arr).map((x)->x=x+1).forEach(System.out::print);
	}
	public static void test10(){
		int[] arr = {1,3,4,5,6,79,2};
		System.out.println();
		Arrays.stream(arr).map((x)->(x%2==0?x:x+1)).forEach(System.out::print);
	}
	
	
	
	
	
}//
