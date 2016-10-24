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
		System.err.println("-------------1-----------");
		test01();
		System.err.println("-------------2-----------");
		test02();
		System.err.println("-------------3-----------");
		test03();
		System.err.println("-------------4-----------");
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
		list.stream().forEach((u)->System.out.println(u+"=="+ave(u)));
	}
	private static void test04(){
		list.stream().filter(x->x.getId()==1)
					.mapToInt(x->(Arrays.stream(x.getScores()).max()).orElse(0))
					.forEach(System.out::println);
	}

	
	
}//
