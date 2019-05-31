# Challenge Summary
Create a dynamic function that will do a binary search through an array, for a given target value.

## Challenge Description
Conduct a binary search through a sorted array for a given target value. When the value is found, return the index of
where the value is found.

## Approach & Efficiency
I first set variables to represent the lowest value in the array at index 0 and the highest value in the array at the
length -1. Next I create a while loop to conduct the binary search. Inside the loop, create the midpoint by adding the
low value to the quotient of the difference between the high and low value. Once the midpoint has been set, a
conditional is set to check if the midpoint is greater than target, if it is then it then sets the high value to get the
value of the midpoint. There is a conditional for the opposite as well. The loop keeps going until the midpoint is equal
to the target value and returns the index of the value; if the value is not found, then the method returns a -1.

## Solution
Format: ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/BinarySearchWhiteBoard.jpg)
