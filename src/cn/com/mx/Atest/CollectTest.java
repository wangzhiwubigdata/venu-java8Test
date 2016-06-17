package cn.com.mx.Atest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectTest {
	static int[] arr ={1,2,3,4,5,6,7};
	public static void main(String[] args) {
		List<Integer> list = Arrays.stream(arr).collect(ArrayList::new,ArrayList::add,ArrayList::addAll);
		
		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println(set.contains(3));
		
	}
}
