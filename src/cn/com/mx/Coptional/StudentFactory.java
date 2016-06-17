package cn.com.mx.Coptional;

import java.util.ArrayList;
import java.util.List;

public class StudentFactory {
	public static int [][] scores= {
			{60,70,80,77},{65,99,78,96,100},
			{63,82,97,30,60},{60,50,30,70,69},
			{61,71,82,65,66},{90,88,93,87,85},
			{66,88,75,79,81},{59,45,32,77,53},
			{69,59,87,52,41},{78,88,69,81,76}
	};
	public static List<Student> createStudent(){
		List<Student> re = new ArrayList<>();
		for (int i = 1; i <= 10; i++) {
			Student t = new Student(i, "billy"+i, "班級"+(i%2==0?1:2));
			t.setScores(scores[i-1]);
			re.add(t);
		}
		Student t= new Student(11, "billy2", "班級 1");
		re.add(t);
		t.setScores(new int[0]);
		return re;
	}
	
	
}
