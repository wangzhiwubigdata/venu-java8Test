package cn.com.mx.lambda;

public class User {
	private Integer age;
	private String name;
	public User(Integer age, String name) {
		this.age = age;
		this.name = name;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public Integer getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
