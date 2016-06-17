package cn.com.mx.Dcollcttors;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import cn.com.mx.Coptional.Student;
import cn.com.mx.Coptional.StudentFactory;

public class CollectorsTest02 {
	static List<Student> list = StudentFactory.createStudent();
	static Comparator<Student> aveScore= (u1,u2)->ave(u1)>ave(u2)?1:-1;
	private static double ave(Student stu){
		return Arrays.stream(stu.getScores()).average().orElse(0);
	}
	public static void main(String[] args) {
		//test01();
		test02();
	}
	static void test01(){
		list.stream()
		.collect(Collectors.reducing(BinaryOperator.maxBy(aveScore)))
		.ifPresent(u->System.out.println(u));
	}
	static void test02(){
		//輸出每個班級中平均分最高的同學
		list.stream().collect(Collectors.groupingBy(Student::getClassNumber,Collectors.reducing(BinaryOperator.maxBy(aveScore))))
						.forEach((k,v)->System.out.println(k+"-"+v.get()));
		
		
	}
	
}//end of class
