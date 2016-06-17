package cn.com.mx.Dcollcttors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cn.com.mx.Coptional.Student;
import cn.com.mx.Coptional.StudentFactory;

public class CollectorsTest01 {
	
	public static void main(String[] args) {
		List<Student> list = StudentFactory.createStudent();
		Map<String, Double> students = list.stream()
				.collect(Collectors.groupingBy(Student::getClassNumber,Collectors.averagingDouble((final Student u) ->ave(u))));
		System.out.println(students);
	}
	
	
	
	
	
	
	//计算学生平均分
	private static double ave(Student stu){
		return Arrays.stream(stu.getScores()).average().orElse(0);
	}
}
