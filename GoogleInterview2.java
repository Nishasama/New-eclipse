package Optimized;

public class GoogleInterview2 {
	
	public static void main(String[] args)
	{
		  int[] arr1 = {2,9,14};
		   int[] arr2 = {13,18,-1,-1,-1};
		   for(int i : mergeSortedArrays(arr1,arr2))
			   System.out.print(" "+i);
		   
			//  int[] arr1= {};
	}
	
	public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int end1 = arr1.length - 1;
        int end2 = arr2.length - 1;
        int writeIndex = end2;

        while (arr2[end2] == -1 && end2 >= 0) {
            end2--;
        }

        while (end1 >=0 && end2 >= 0) {
            if (arr1[end1] > arr2[end2]) {
                arr2[writeIndex] = arr1[end1];
                writeIndex--;
                end1--;
            } else if (arr1[end1] < arr2[end2]) {
                arr2[writeIndex] = arr2[end2];
                end2--;
                writeIndex--;
            } else { //both are equal case
                arr2[writeIndex] = arr1[end1];
                writeIndex--;
                arr2[writeIndex] = arr1[end1];
                writeIndex--;
                end1--;
                end2--;
            }
        }

        //Example test case
        //[1,3,5,6,7,8]
        //[2,4,-1,-1,-1,-1,-1,-1]
        if (end2 < 0) {
            while (end1 >= 0) {
                arr2[writeIndex] = arr1[end1];
                writeIndex--;
                end1--;
            }
        }

        return arr2;
    }

}
