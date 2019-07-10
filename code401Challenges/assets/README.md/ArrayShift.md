# Challenge Summary
Create a dynamic function that will insert a number into the center of an array.

## Challenge Description
Insert a new value into the middle of an array with a set length in Java.

## Approach & Efficiency
I set a variable with the midpoint of the existing array. The midpoint was found by dividing the length by two and
getting the floor of the value returned. Next I created a new array with the old length +1 so that it can accept the new
input value. lastly I created a For loop that went the length of the new array with three conditionals.
The first conditional went up to the midpoint and got the values from the input array, the second conditional inserted
the new value into the midpoint of the array, and the final conditional added the remaining values of the input array
for the given index -1 so that it could match the same position for the new output array

## Whiteboard Solution
Array Shift ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/ArrayShiftWhiteboard.jpg)


## Code Solution
[ArrayShift Code](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/ArrayShift.java)
