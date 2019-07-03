package code401Challenges.insertionSort;

public class QuickSort {

    public static void quickSort(int arr[]){

        if (arr.length == 0) throw new IllegalArgumentException("array is empty");

        quickSorter(arr, 0, arr.length -1);
    }

    private static void quickSorter(int arr[], int left, int right){

        if (left < right){
            int position = partition(arr, left, right);
            //sorting the left
            quickSorter(arr, left, position - 1);
            //sorting the right
            quickSorter(arr, position + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {

        int pivot = arr[right];
        int low = left - 1;

        for (int i = left; i < right; i++){

            if (arr[i] <= pivot){
                low++;
                swap(arr, i, low);

            }
        }

        swap(arr, right, low + 1);

        return low + 1;
    }

    private static void swap(int[] arr, int i, int low) {

        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
