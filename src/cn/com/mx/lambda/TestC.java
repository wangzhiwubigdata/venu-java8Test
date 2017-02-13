package cn.com.mx.lambda;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestC {
	public static void main(String[] args) {
		List<User> users = IntStream.range(0, 10).mapToObj(i -> new User(i, "billy" + Integer.toString(i))).collect(Collectors.toList());
		users.stream().map(User::getName).forEach(System.out::println);
	}
}
