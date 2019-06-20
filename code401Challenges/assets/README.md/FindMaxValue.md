# Challenge Summary
Write a function called find-maximum-value which takes binary tree as its only input. Return the maximum value stored in the tree.

## Challenge Description
Traverse through a given tree and find the maximum value. Return the maximum value when found.

## Approach & Efficiency
First create the method that takes in a tree, and we check if it is null and throw an exception if so. Next we call a 
helper function that we create to deal with the individual node of the tree. The helper has a max variable that holds value
of the node. The next step is set a conditional for the left child node to make sure that it's not null. If not, we compare
the values using a Math.max on the original node and the child, in a recursive call, and set that value to the max. We 
do the same for the right child and then we finally return the max.

## Acknowledgements
Will and John guided me through this challenge.

## Solution
Find Max Value ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/FindMaxValue.jpg)
