package cn.com.mx.hello;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class ArrayTest3 {
	
	static int[] array ={1,2,3,4,5,6,7,8};
	static IntConsumer outprintln = System.out::println;
	static IntConsumer errprintln = System.err::println;
	public static void main(String[] args) {
		Arrays.stream(array).forEach(outprintln.andThen(errprintln));
	}
}
