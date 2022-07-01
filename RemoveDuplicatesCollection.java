package week3.day2.assignments;

import java.util.LinkedHashSet;

public class RemoveDuplicatesCollection {
	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<>();
		for (int i=0;i<words.length;i++) {
			set.add(words[i]);
		}  
		System.out.println(set);
		for (String eachword : set) {
			System.out.print(eachword + " ");		
		}
	}

}


