package Optimized;
// Java program to print anagrams  
// together using dictionary 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List; 
  
public class FindAnagramsInStringArray { 
  
    private static void printAnagrams(String arr[]) 
    { 
        HashMap<Integer, List<String> > map = new HashMap<>(); 
  
        // loop over all words 
        for (int i = 0; i < arr.length; i++) { 
        	if(arr[i]==null || arr[i].length()<1)
        		continue;
  
            // convert to char array, sort and 
            // then re-convert to string 
            String word = arr[i]; 
            char[] letters = word.toCharArray(); 
            Arrays.sort(letters); 
            String newWord = new String(letters); 
  
            // calculate hashcode of string 
            // after sorting 
            int n = newWord.hashCode(); 
            if (map.containsKey(n)) { 
  
                // Here, we already have 
                // a word for the hashcode 
                List<String> words = map.get(n); 
                words.add(word); 
                map.put(n, words); 
            } 
            else { 
  
                // This is the first time we are 
                // adding a word for a specific 
                // hashcode 
                List<String> words = new ArrayList<>(); 
                words.add(word); 
                map.put(n, words); 
            } 
        } 
  
        //System.out.println(map);
        // print all the values where size is > 1 
        // If you want to print non-anagrams, 
        // just print the values having size = 1 
        for (Integer i : map.keySet()) {     // REMEMBER, THIS LOOP NEED TO BE ADDED AFTER FOR LOOP
            List<String> values = map.get(i); 
            if (values.size()  >1) { 
                System.out.print(values); 
            } 
        }
        System.out.println("%%%%%%%%%%%%%");

            for(List<String> list1 : map.values()) {
            	if(list1.size()>1)
            		System.out.println(list1);
            
        } 
        
        /*for(List list1 : map.values())
        	System.out.println(list1);*/
    } 
  
    public static void main(String[] args) 
    { 
  
        // Driver program 
        String arr[] = { "cat", "dog", "tac", "god", "act","pat"}; 
        printAnagrams(arr); 
    } 
} 