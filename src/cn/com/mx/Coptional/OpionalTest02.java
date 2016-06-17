package cn.com.mx.Coptional;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author wangchangye
 *
 */
public class OpionalTest02 {
	static List<Student> list = StudentFactory.createStudent();
	public static void main(String[] args) {
		//test01();
		//test02();
		test04();
	}
	
	private static void test01(){
		list.stream()
		.mapToDouble((x) -> Arrays.stream(x.getScores()).average().orElse(0))
		.forEach(System.out::println);
	}
	private static void test02(){
		list.stream().forEach((x)->Arrays.stream(x.getScores()).average().ifPresent(System.out::println));
	}
	
	private static double ave(Student stu){
		return Arrays.stream(stu.getScores()).average().orElse(0);
	}
	private static void test03(){
		list.forEach((u)->System.out.println(u+"=="+ave(u)));
	}
	private static void test04(){
		list.stream().filter(x->x.getId()==2)
					.mapToInt(x->(Arrays.stream(x.getScores()).min()).orElse(0))
					.forEach(System.out::println);
	}

	
	
}//
