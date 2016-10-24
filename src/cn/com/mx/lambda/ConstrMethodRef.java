package cn.com.mx.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ConstrMethodRef {
	
	@FunctionalInterface
	interface UserFactory<U extends User>{
		U create(int id, String name);
	}
	
	static UserFactory<User> uf =User::new;
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			users.add(uf.create(i, "billy"+Integer.toString(i)));
		}
		users.stream().map(User::getName).forEach(System.out::println);
		
		
		
		//reduce
		final List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
	    final Optional<Integer> sum = numbers.stream()
	            .reduce((a, b) -> a + b);
		System.err.println(sum.orElse(0));//sum.orElseGet(()->0  如果numbers没值则给个0
	}
	

	
	
	
}//endofclass
