package cn.com.mx.hello;

import java.util.Arrays;

/**
 * 函数filter()接收一个谓词操作，如果谓词返回true，那么当前元素就会被处理，如果谓词返回false，那么元素就会被简单的丢弃。
 * @author wangchangye
 *
 */
public class ArrayTest4 {
	
	static int[] arr={1,2,3,4};
	public static void main(String[] args) {
		Arrays.stream(arr).filter((x)->x%2==0).forEach(System.out::println);
		
	}
}
