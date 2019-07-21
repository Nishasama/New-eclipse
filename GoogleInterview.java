package Optimized;



/**
* <b>IDeserve <br>
* <a href="https://www.youtube.com/c/IDeserve">https://www.youtube.com/c/IDeserve</a>
* Merging of two sorted arrays without using extra space (space complexity O(1))
* @author Nilesh
*/

public class GoogleInterview
 
{
final static int INVALID_NUM = 0;

public void inplaceMergeArrays(int[] arrayA, int[] arrayB)
{
// move all elements of arrayA with valid values towards the end
int validNumIndex = arrayA.length - 1;
System.out.println("array");
for (int i = arrayA.length - 1; i >= 0; i--)
{
if (arrayA[i] != INVALID_NUM)
{
   arrayA[validNumIndex] = arrayA[i];
   System.out.println("i "+i+" arrayA[i] "+arrayA[i]+" validIndex "+validNumIndex+" arrayA[validNumIndex] "+arrayA[validNumIndex]);
   validNumIndex -= 1;
}
}
for(int p=0;p<arrayA.length;p++)
	System.out.print(" "+arrayA[p]);
System.out.println("array");
System.out.println(arrayA.length+" arrayA.length");

// i: index of first valid valued element in arrayA
int i = validNumIndex + 1;
int j = 0, k = 0;

// fill-up arrayA starting from 0th index since this end of arrayA is free now
while ((i < arrayA.length) && (j < arrayB.length))
{
if (arrayA[i] < arrayB[j])
{
   arrayA[k++] = arrayA[i++];
}
else
{
   arrayA[k++] = arrayB[j++];
}
}

// copy any remaining elements of smaller array into larger one 
while (j < arrayB.length)
{
arrayA[k++] = arrayB[j++];
}
}

public static void main(String[] args) 
{
	GoogleInterview solution = new GoogleInterview();


int[] arrayA = {-3, 5, INVALID_NUM, 7, INVALID_NUM, 10, INVALID_NUM, 11, INVALID_NUM};
int[] arrayB = {-1, 2, 6, 12};

solution.inplaceMergeArrays(arrayA, arrayB);
for (int i = 0;  i < arrayA.length; i++)
{
System.out.print(arrayA[i] + ", ");
}
}



public int[] mergeSortedArrays(int[] arr1, int[] arr2) {
    int end1 = arr1.length - 1;
    int end2 = arr2.length - 1;
    int writeIndex = end2;

    while (arr2[end2] == -1) {
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

