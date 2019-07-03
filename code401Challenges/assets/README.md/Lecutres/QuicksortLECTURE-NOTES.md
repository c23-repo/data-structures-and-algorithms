# Lecture Notes: Insertion Sort

For the Quick Sort, we will write a systematic method that will take in an array as a parameter and sort them in ascending order.

## Learning Objectives:

- Understand the problem domain.
- Understand how the method is sorting the array in ascending order.
- Build a method that will sort the given array.
- Build the helper methods and understand how the recursion is working.

## Lecture Flow

- Main point:
  - Sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - This sort is consistent across any size or complexity of several different arrays. 
  - The algorithm takes O(n log n) comparisons to sort n items. 
  - In the worst case, which is rare, the Quick Sort makes O(n<sup>2</sup>) comparisons.
  
## Algorithm

- Check that array is not empty, if so throw error.
- Create the wrapper that takes in the array.
- Create the quickSort method that will do the sorting.
- Create the partition helper that will have a pivot variable and two iterators, one always moving and the trailing to 
swap with the pivot.
- Create the swap method that will move the greater values to the end so that it is being sorted. 

## PsuedoCode


``` 
ALGORITHM QuickSort(arr, left, right)
        if left < right
            // Partition the array by setting the position of the pivot value 
            DEFINE position <-- Partition(arr, left, right)
            // Sort the left
            QuickSort(arr, left, position - 1)
            // Sort the right
            QuickSort(arr, position + 1, right)
    
    ALGORITHM Partition(arr, left, right)
        // set a pivot value as a point of reference
        DEFINE pivot <-- arr[right]
        // create a variable to track the largest index of numbers lower than the defined pivot
        DEFINE low <-- left - 1
        for i <- left to right do
            if arr[i] <= pivot
                low++
                Swap(arr, i, low)
    
         // place the value of the pivot location in the middle.
         // all numbers smaller than the pivot are on the left, larger on the right. 
         Swap(arr, right, low + 1)
        // return the pivot index point
         return low + 1
    
    ALGORITHM Swap(arr, i, low)
        DEFINE temp;
        temp <-- arr[i]
        arr[i] <-- arr[low]
        arr[low] <-- temp

```


## Reading References

- Read:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/quick-sort/)
  - [Wikipedia](https://en.wikipedia.org/wiki/Quicksort)