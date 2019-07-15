# Challenge Summary
Create a function that will return all the values of two HashMaps with the same key.

## Challenge Description
Return all the values of the given HashMaps with the same key. Return all the keys that exist in the first HashMap.
If the second value is null, insert null to as the value.

## Approach & Efficiency
First we create a method that returns an `ArrayList` within an `ArrayList` and takes in two `HashMap`'s. Then we instantiate two `ArrayList`'s, 
one for the wrapper array and the inner arrays at each index. Now we do a for each loop to with a `keySet` to get all the keys and values in the `HashMap`. 
Final step is to `add` the keys and then add the values to the subArrays. Once that is done we add the subArray to the wrapper array and return the result.

## Whiteboard Solution
Tree Intersection ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/LeftJoin.jpg)

## Code Solution
[Left Join Code](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/leftJoin/LeftJoin.java)

## Acknowledgements
Stephen guided me through this challenge.
