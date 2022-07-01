package week3.day2.assignments;
import java.util.HashMap;
import java.util.Map;
public class FirstMostDuplicateMap {

	public static void main(String[] args) {
		String str="abbaba";
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for (int i = 0; i < ch.length; i++) {
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);}
			else {
				map.put(ch[i],1);}
		}
		int maxi=0;
		for (Map.Entry<Character,Integer> eachEntry: map.entrySet()) 
			if( eachEntry.getValue() > maxi){
				maxi= eachEntry.getValue();
			}	
		System.out.println("Maxi count - " + maxi );
		
		for (Map.Entry<Character,Integer> eachEntry: map.entrySet()) 
			if(eachEntry.getValue() == maxi){
				System.out.println("first most duplicate is " + eachEntry.getKey());
				break; // I am getting 'a' as first most duplicate , should not be b?????????
			}
	}
}


