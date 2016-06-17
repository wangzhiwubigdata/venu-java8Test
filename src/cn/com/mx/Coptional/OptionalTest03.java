package cn.com.mx.Coptional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  自定义比较器
 * @author wangchangye
 *
 */
public class OptionalTest03 {
	static List<Student> list = StudentFactory.createStudent();
	static Comparator<Student> aveScore= (u1,u2)->ave(u1)>ave(u2)?1:-1;
	private static double ave(Student stu){
		return Arrays.stream(stu.getScores()).average().orElse(0);
	}
	
	public static void main(String[] args) {
		//list.stream().max(aveScore).ifPresent(System.out::println);
		//test01();
		test02();
	}
	
	private static void test01(){
		list.stream().sorted(Comparator.comparing(Student::getName))
					.forEach(u->System.out.println(u.getName()));
	}
	//按成绩排序,然后按照姓名排序
	private static void test02(){
		list.stream().sorted(aveScore.thenComparing(Comparator.comparing(Student::getName)))
					.forEach(System.out::println);
	}
	
	
	
}
