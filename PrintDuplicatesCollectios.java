package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintDuplicatesCollectios {

	public static void main(String[] args) {
		Integer[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(array));
		int list1, list2;
		for(int i=0;i<list.size();i++) {
			for (int j=i+1;j<list.size();j++) {
				list1=list.get(i);
				list2=list.get(j);			
				if (list1==list2) {
					System.out.println(list1);}
			}

		}

	}

}
