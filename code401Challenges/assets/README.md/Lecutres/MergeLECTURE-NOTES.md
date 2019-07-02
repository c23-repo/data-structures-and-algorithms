# Lecture Notes: Insertion Sort

For the Merge Sort, we will write a method that will take in an array as a parameter and sort them in ascending order by 
splitting them into sub-arrays.

## Learning Objectives:

- Understand the problem domain.
- Understand how the method is sorting the array in ascending order.
- Build a method that will sort the given array.

## Lecture Flow

- Main point:
  - Sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - This sort will be very useful for large arrays. 
  
## Algorithm

- Check that array is not empty, if so throw error
- Divide the unsorted lists into sub-arrays, each containing one value. 
- Merge the sub-arrays so that they become one sorted array

## PsuedoCode


```  ALGORITHM Mergesort(arr)
         DECLARE n <-- arr.length
                
         if arr.length > 1
           DECLARE mid <-- n/2
           DECLARE b <-- arr[0...mid]
           DECLARE c <-- arr[mid...n]
           // break down the left side
           Mergesort(b)
           // break down the right side
           Mergesort(c)
           // merge the left and the right side together
           Merge(b, c, arr)
     
     ALGORITHM Merge(b, c, a)
         DECLARE i <-- 0
         DECLARE j <-- 0
         DECLARE k <-- 0
     
         while i < b && j < c
             if b[i] <= c[j]
                 a[k] <-- b[i]
                 i <-- i + 1
             else
                 a[k] = c[j]
                 j <-- j + 1
                 
             k <-- k + 1
     
         if i = b.length
            add remaining items in array c to array a
         else
            add remaining items in array b to array a
            
         return a

```


## Reading References

- Read:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/merge-sort/)
  - [Tutorials Point](https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm)
  - [Wikipedia](https://en.wikipedia.org/wiki/Merge_sort)