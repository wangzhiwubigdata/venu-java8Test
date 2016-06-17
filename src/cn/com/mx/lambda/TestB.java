package cn.com.mx.lambda;

import java.util.function.Function;

/**
 * 函数式接口只能有一个抽象方法，而不是指只能有一个方法。这分两点来说明。首先，在Java
 * 8中，接口运行存在实例方法（见默认方法一节），其次任何被java.lang.Object实现的方法，都不能视为抽象方法
 * 
 * @author wangchangye
 *
 */
public class TestB {
	public static void main(String[] args) {
		final int num = 2;
		Function<Integer, Integer> stringConverter = (from) -> from * num;
		System.out.println(stringConverter.apply(3));
	}
}
