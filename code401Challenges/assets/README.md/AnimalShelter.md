# Challenge Summary
Create an Animal Shelter queue that takes in cats and dogs. Return the animal that has been there the longest.
## Challenge Description
Insert an animal into a queue and return the preferred animal type that has been there the longest.
## Approach & Efficiency
I created two queues to hold all the dogs that get put in the shelter and another for all the cats as well. I used 
generics to be able to input the information. Then I created an enqueue method to store the animal instance to the 
appropriate queue. The next method was a dequeue method that returns the animal preference and the animal that has been 
there the longest. If null it dose not return anything.

## Solution
Animal Shelter: ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/AnimalShelter.jpg)
