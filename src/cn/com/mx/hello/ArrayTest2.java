package cn.com.mx.hello;

import java.util.Arrays;

public class ArrayTest2 {
	static int[] array ={1,2,3,4,5,6,7,8};
	public static void main(String[] args) {
		Arrays.stream(array).forEach((final int x)->{System.out.println(x);});
		Arrays.stream(array).forEach((x)->{System.out.println(x);});
		Arrays.stream(array).forEach(System.out::println);
		
		
	}
}//endofclass
