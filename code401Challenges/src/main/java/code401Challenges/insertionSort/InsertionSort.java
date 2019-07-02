package code401Challenges.insertionSort;

public class InsertionSort {

    public static void InsertionSort( int [] arrSort){

        if (arrSort.length == 0) throw new IllegalArgumentException("Array must have values to be sorted");

        // goes forward in the array
        for (int i = 1; i < arrSort.length; i++){
            int tempKey = arrSort[i];
            int j = i - 1;
            // goes backwards in the array and compares the values
            while (j >= 0 && arrSort[j] > tempKey){
                arrSort[j + 1] = arrSort[j];
                j = j -1;
            }
            arrSort[j + 1] = tempKey;
        }

    }

}
