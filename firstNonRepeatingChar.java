package Optimized;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class firstNonRepeatingChar {

	public static void main(String[] args) {
		
	char[] arr1= {'n','i','s','h','i','t','h','n','a'};
	
	HashMap<Character,Integer> map1=new LinkedHashMap<Character,Integer>();
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
		if(map1.get(c)==1)
		{
			System.out.println(c);
		break;
		}
	}
	for(Map.Entry<Character, Integer> entry : map1.entrySet())
	{
		if(entry.getValue()==1)
		{
			System.out.println(entry.getKey());
		break;
		}
	}
	for(int i=0;i<arr1.length;i++)
	{
		if(map1.get(arr1[i])==1)
		{
			System.out.println(arr1[i]);
			break;
		}
	}
	
}
}