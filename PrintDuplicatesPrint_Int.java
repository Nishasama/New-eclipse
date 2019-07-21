package Optimized;

public class PrintDuplicatesPrint_Int {

	public static void main(String[] args) {

		int[] arr1 = { 2, 2, 3, 3, 4, 4, 5, 10, 5, 5, 5, 5, 6,7, 12, 9, 9 };
		// int[] arr1= {6,6,6,6};
		int[] arr2 = countDups(arr1);

		for (int i : arr2)
			System.out.print(" " + i);
	}

	public static int[] countDups(int[] arr1) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
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
			return arr1;
		if (min == max)
			return (new int[] { min });

		int[] count = new int[range];
		// int[] arr2=new int[range];

		for (int num : arr1) {
			count[num - min]++;
		}
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= 1)
				count[i] = i + min;
			else
				count[i]=0;
		}
		/*
		 * for(int i=0;i<arr1.length;i++) { if(count[arr1[i]-min]>1)
		 * System.out.println(" "+arr1[i]); }
		 */
		return count;  // OTHERWISE RETURN ARRAYLIST NAMED AS DUPLIST
	}

}
