# Challenge Summary
Write a breadth first traversal method which takes a Binary Tree as its unique input. 
## Challenge Description
Conduct a breadth first traversal through a given tree. Print out the values of the given node in order.

## Approach & Efficiency
First create the method that takes in a tree. Then we create a Queue and set a Node with the value of the root.
Next we enqueue the node to the queue. After the Queue has a node, we set a while loop that dequeue's the node, adds that 
value to a string, and then checks if that node has left or right children. If it does we add them to the Queue starting 
from the left, if not then we ignore the null value. We break from the loop when the Queue is empty and then return the 
string with all the values found in order.

## Solution
Breadth First Traversal ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/BreadthFirst.jpg)
