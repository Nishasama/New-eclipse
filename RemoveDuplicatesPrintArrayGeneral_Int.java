package Optimized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicatesPrintArrayGeneral_Int { // REMEMBER THIS WILL WORK FOR SORTED ARRAY, BECAUSE IT INCREMENTS AS PER COUNT = 0 TO COUNT< LENGTH AND LIST MAINTAINS ORDER

	public static void main(String[] args) {

		//int[] arr1 = { 2, 2, 3, 3, 4, 4, 5, 10, 5, 5, 5, 5, 6,7, 12, 9, 9 };
		int[] arr1 = { 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5, 6, 7, 9, 9, 10, 12 };

		// int[] arr1= {6,6,6,6};
		

		for (Integer i : countDups(arr1))
			System.out.print(" " + i);
	}

	public static List<Integer> countDups(int[] arr1) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		List list1=new ArrayList();
		for (int num : arr1) {
			if (num < min)
				min = num;
		}
		for (int num : arr1) {
			if (num > max)
				max = num;
		}
		int range = max - min + 1;

		if (arr1.length <= 1)
			return list1;
		if (min == max)
		{
			list1.add(min);
		
			return list1;
		}
		
		int[] count = new int[range];
		// int[] arr2=new int[range];

		for (int num : arr1) {
			count[num - min]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= 1)
				list1.add(i+min);
		}
		/*
		 * for(int i=0;i<arr1.length;i++) { if(count[arr1[i]-min]>1)
		 * System.out.println(" "+arr1[i]); }
		 */
		return list1;  
	}

}
