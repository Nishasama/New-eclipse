package Optimized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SaiSameIndices {
	
	public static void main(String[] args)
	{
		int[] arr1= {3,5,2,6,6,2,5,5,3};
		System.out.println(sameIndexes(arr1));
	}	
public static List<String> sameIndexes(int[] arr1)
{
    List<String> list1=new ArrayList<String>();
    // map to store key as 'num' and value as list of all indices 'num' appears at
    HashMap<Integer, List<Integer>> map1 = new HashMap<>();
    int[] result={};

    for(int i = 0; i < arr1.length; i++)
    {
        int num = arr1[i];
        //get list of all indices 'num' appears at
        List<Integer> list = map1.get(num);

        //if this is the first time 'num' is seen, make a new list, add (num, [currentIndexOfNum]) to hashmap
        // This means num appears at index currentIndexOfNum
        if (list == null) {
            //create a new list
            List<Integer> temp = new ArrayList<>();
            //add currentIndexOfNum to the new list
            temp.add(i);
            //put this new list as value for key num
            map1.put(num, temp);
        } else {
            // if 'num' already appeared before index i in the array,
            // then for each of the indices where 'num' appeared in the array,
            // add the previously seen index and currentIndexOfNum to the final list (list1)
            for (int j : list) {
                //index is previously seen index of 'num'
                result = new int[]{j, i};
                list1.add(Arrays.toString(result));
            }
            //add currentIndexOfNum to the list of previously seen indices of num
            list.add(i);
            map1.put(num, list);
        }
    }
    return list1;

}
}