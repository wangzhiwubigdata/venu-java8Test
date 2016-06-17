package cn.com.mx.Dcollcttors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import cn.com.mx.Coptional.Student;
import cn.com.mx.Coptional.StudentFactory;

public class DcollectorsTest03 {
	static List<Student> list = StudentFactory.createStudent();
	static Comparator<Student> aveScore= (u1,u2)->ave(u1)>ave(u2)?1:-1;
	private static double ave(Student stu){
		return Arrays.stream(stu.getScores()).average().orElse(0);
	}
	public static void main(String[] args) {
		
		String allNames = list.stream().map(Student::getName).collect(Collectors.joining(","));
		System.out.println(allNames);
		System.out.println("-------------");
		System.err.println(String.join("-", "a","b","c"));
		allNames.chars().mapToObj(c->Character.toUpperCase(c)).forEach(System.out::print);
	}
	
}//end of class
