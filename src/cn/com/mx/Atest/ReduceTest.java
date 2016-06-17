package cn.com.mx.Atest;

import java.util.Arrays;

public class ReduceTest {
	
	static int[] arr = {1,2,3,4,5,6,7,8,9};
	public static void main(String[] args) {
		Arrays.stream(arr).reduce((x,y)->x+y).ifPresent(System.out::println);
	}
}

