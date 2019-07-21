
package Optimized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindAnagramsSai{

     public static void main(String []args){
        System.out.println("Hello World");
        FindAnagramsSai hw = new FindAnagramsSai();
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("eat");
        wordList.add("tea");
        wordList.add("tan");
        wordList.add("ate");
        wordList.add("nat");
        wordList.add("bat");
        ArrayList<ArrayList<String>> anagramsGroup = hw.groupAnagrams(wordList);
        
        for (List<String> list : anagramsGroup) {
            System.out.println(Arrays.toString(list.toArray()));
            
        }
     }
     
     public ArrayList<ArrayList<String>> groupAnagrams(List<String> input) {
         HashMap<String, ArrayList<String>> anagramMap = new HashMap<String, ArrayList<String>>();
         ArrayList<ArrayList<String>> output = new ArrayList<ArrayList<String>>();
         
         for (String str : input) {
             // null and empty check
             if (str == null || str.length() < 1) {
                 continue;
             }
             
             // sort string to group all anagram together
             String sortedStr = sortString(str);
            
             
             /* example: 
                str: eat 
                sortedStr: aet
                
                if map doesn't have entry for aet, add the word eat to new list and assign value of hashmap
                
                if map has entry for aet, get the value of hashmap for aet (List<String> and add eat to it)
             */
             if (anagramMap.get(sortedStr) == null) {
            	 ArrayList<String> temp = new ArrayList<String>();
                 temp.add(str);
                 anagramMap.put(sortedStr, temp);
             } else {
            	 ArrayList<String> temp = anagramMap.get(sortedStr);
                 temp.add(str);
                 anagramMap.put(sortedStr, temp);
             }
         }
         
         /*
            For example: ["eat", "tea", "tan", "ate", "nat", "bat"],
            Hashmap looks like this
            
            "aet" => ["ate","eat","tea"],
            "ant" => ["nat","tan"],
            "abt" => ["bat"]
            
            add all values to output list and return
         */
         for (ArrayList<String> valueList : anagramMap.values()) {
        	 if(valueList.size()>1)
             output.add(valueList);
         }
         System.out.println(output.size()+" output "+output);
         return output;
     }
     
     // Copied from https://www.geeksforgeeks.org/sort-a-string-in-java-2-different-ways/
     // Method to sort a string alphabetically 
    public String sortString(String inputString) 
    { 
        // convert input string to char array 
        char tempArray[] = inputString.toCharArray(); 
          
        // sort tempArray 
        Arrays.sort(tempArray); 
          
        // return new sorted string 
        return new String(tempArray); 
    } 
}