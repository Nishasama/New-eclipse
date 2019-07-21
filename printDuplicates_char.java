package Optimized;

import java.util.HashMap;
import java.util.Map;

public class printDuplicates_char {

	public static void main(String[] args) {
		
	char[] arr1= {'n','i','s','h','i','t','h','a'};
	
	HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
	for(char c : arr1)
	{
		if(map1.containsKey(c))
		{
			map1.put(c, map1.get(c)+1);
		}
		else
			map1.put(c, 1);
	}
	for(char c : map1.keySet())
	{
		if(map1.get(c)>1)
			System.out.println(c);
	}
	for(Map.Entry<Character, Integer> entry : map1.entrySet())
	{
		if(entry.getValue()>1)
			System.out.println(entry.getKey());
	}
	
}
}