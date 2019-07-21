package Optimized;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {
		
		int[] arr1= {1,1,2,2,2,2,3,3,4,5,6,7,7,7,7,7,8};
		removeDuplicates(arr1);
	}
	
	public static void removeDuplicates(int[] arr) {
        int readIndex = 1, writeIndex = 1, previousNum;

        if (arr.length <= 1) {
            return;
        }

        previousNum = arr[0];

        while (readIndex < arr.length) {
            if (arr[readIndex] == previousNum) { //found duplicate. ignore and move onto next element
                readIndex++;
            } else { //new element found. write this element to array in the writeIndex. increment writeIndex. store current element in previousNum
                arr[writeIndex] = arr[readIndex];
                previousNum = arr[readIndex];
                writeIndex++;
                readIndex++;
            }
        }
        int temp=0;
      while(temp<writeIndex)
      {
        System.out.print(" "+arr[temp]);
        temp++;
      }
    }

}
