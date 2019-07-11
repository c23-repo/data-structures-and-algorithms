# Challenge Summary
Create a function that will Find common values in 2 binary trees.

## Challenge Description
Insert two trees and return the common values that are in both binary trees. 

## Approach & Efficiency
First we create a method that returns an `ArrayList` and takes in two binary trees. Then we instantiate two `HashSet`'s, 
one for each tree. Now we do a for each loop to with a `preOrder` traversal and add all the values into the `HashSet`. 
Final step is to another for each loop for the tree B, but now we check if the `HashSet` for tree A and if it does then 
we add the values from tree B to its `HashSet`. Then we return the resulting `ArrayList`.

## Whiteboard Solution
Tree Intersection ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/TreeIntersection.jpg)

## Code Solution
[Tree Intersection Code](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/TreeIntersection/TreeIntersection.java)

## Acknowledgements
Stephen guided me through this challenge.
