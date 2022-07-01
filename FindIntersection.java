package week3.day2.assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class FindIntersection {

	public static void main(String[] args) {

		Integer[] array1 ={3,2,11,4,6,7};
		Integer[] array2={1,2,8,4,9,7};
		HashSet<Integer> set = new LinkedHashSet<>(); 
		set.addAll(Arrays.asList(array1));
		set.retainAll(Arrays.asList(array2));
		System.out.println(set);

	}
}





