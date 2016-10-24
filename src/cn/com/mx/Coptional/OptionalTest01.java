package cn.com.mx.Coptional;

import java.util.OptionalDouble;
/**
	 * 在整个过程中，没有null的出现，我们使用OptionalDouble.empty()来代替一个无意义的空值，
	 * 而ifPresent()函数只会处理那些有意义的值。
 * @author wangchangye
 *
 */
public class OptionalTest01 {
	public static void main(String[] args) {
		calc(10,2).ifPresent(System.out::println);
	}
	
	
	static OptionalDouble calc(double a, double b){
		if(b==0){
			return OptionalDouble.empty();
		}
		OptionalDouble od = OptionalDouble.of(a/b);
		return od;
	}
}
