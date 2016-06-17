package cn.com.mx.Coptional;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter@Setter@ToString
public class Student extends User{

	private String classNumber;
	private int[] scores;
	public Student(int id, String name,String classNumber) {
		super(id, name);
		this.classNumber = classNumber;
	}

}
