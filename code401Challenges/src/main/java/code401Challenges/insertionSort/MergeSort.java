package code401Challenges.insertionSort;

public class MergeSort {

    public static void mergeSort(int [] arr){

        if (arr.length == 0) throw new IllegalArgumentException("array is empty");

        int n = arr.length;

        if (arr.length > 1){
            int mid = n/2;

            int left [] = new int[mid];
            int right [] = new int[n - mid];

            for(int i = 0; i < mid; i++){
                left[i] = arr[i];
            }
            for(int j = mid; j < n; j++){
                right[j - mid] = arr[j];
            }
            // separate left side array with recursion
            mergeSort(left);
            //separate right side array with recursion
            mergeSort(right);
            //use helper
            merge(left, right, arr);
        }
    }

    private static int [] merge(int[] left, int[] right, int[] arr) {


        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] <= right [j]){
                arr [k] = left [i];
                i++;
            } else {
                arr [k] = right [j];
                j++;
            }
            k++;
        }

        if (i == left.length){
            arr [k] = right [j];

        } else {
            arr [k] = left [i];

        }
        return arr;
    }
}
