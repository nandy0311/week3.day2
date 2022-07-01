package week3.day2.assignments;
import java.util.Map;
import java.util.TreeMap;

public class FindOccurenceTreeMap {

	public static void main(String[] args) {
		int[] intarray =  {2,3,5,6,3,2,1,4,2,1,6,-1};
		TreeMap <Integer,Integer> map = new TreeMap <>();
		 for (int i = 0; i < intarray.length; i++)
	        {
	            if (map.containsKey(intarray[i])) 
	            {
	            	map.put(intarray[i], map.get(intarray[i]) + 1);
	            } 
	            else
	            {
	            	map.put(intarray[i], 1);
	            }
	        }
	        // Traverse through map and print frequencies
	        for (Map.Entry<Integer, Integer> entry : map.entrySet())
	        {
	            System.out.println(entry.getKey() + " ->" + entry.getValue());
	        }
	    }

	}

