package code401Challenges;

public class BinarySearch {
 public int binarySearch(int []arr, int target){

         int low = 0;
         int high = arr.length - 1;

         while (low <= high) {
             int middle = low + (high - low) / 2;

             if(target < arr[middle]) high = middle - 1;
             else if (target > arr[middle]) low = middle + 1;
             else return middle;
         }
         
         return -1;

 }

}
