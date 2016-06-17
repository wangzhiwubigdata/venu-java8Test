package cn.com.mx.hello;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class ArraytEST {

	final static int[] array = {1,2,3,4,5,6,7};
	public static void main(String[] args) {
		Arrays.stream(array).forEach(new IntConsumer() {
			
			@Override
			public void accept(int value) {
				// TODO Auto-generated method stub
				System.out.println(value);
			}
		});
	}
}
