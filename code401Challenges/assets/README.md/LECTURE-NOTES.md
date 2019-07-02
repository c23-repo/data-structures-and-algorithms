# Lecture Notes: Insertion Sort

For the Insertion Sort, we will write a method that will take in an array as a parameter and sort them in ascending order.

## Learning Objectives:

- Understand the problem domain.
- Understand how the method is sorting the array in ascending order.
- Build a method that will sort the given array.

## Lecture Flow

- Main point:
  - Sorts are methods to organize data that is passed into the method. 
- Another Main Point:
  - This sort will be very efficient Big O on time, if the array is already organized. If the array is not,
   it will take an O(n) operation to sort the array. 
  - Insertion sort is mainly used when the size of the array is small. It can be very useful if the array is "almost" organized. 

## Algorithm

- Check that array is not empty, if so throw error
- Start a for loop with i at 1 and going to the end of the array.
- Inside the for loop, initialize two new variables, one to hold the current value, one to act as the advancing variable.
- Inside the while loop, check that the advancing variable is greater than zero, and also that the current value is less 
 than arr value at idex of advancing variable (arr[<advancing variable>])

## PsuedoCode

```  InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp
```

## Reading References

- Read:
  - [Geeks for Geeks](https://www.geeksforgeeks.org/insertion-sort/)
  - [Java Point](https://www.javatpoint.com/insertion-sort-in-java)
- Video
  - [Geeks for Geeks](https://www.youtube.com/watch?v=OGzPmgsI-pQ)