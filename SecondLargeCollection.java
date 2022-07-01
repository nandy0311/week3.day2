package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargeCollection {

	public static void main(String[] args) {
		Integer[] array= {3,2,11,4,6,7,78,23,99,56};
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(array));
		Collections.sort(list);
		int maxi=0;int secondmaxi=0;
		//by selecting second from the last in an array
		System.out.println(list.get(list.size()-2));
		//using for loop
		for (int i=1;i<list.size();i++) {
			if(list.get(i)>maxi) {
				maxi=list.get(i);
				secondmaxi = list.get(i-1);
			}			
		}
		System.out.println(maxi);
		System.out.println(secondmaxi);
		
	}
}
