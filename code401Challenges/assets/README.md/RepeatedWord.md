# Challenge Summary
Write a function called RepeatedWord which takes a String as an argument.

## Challenge Description
Without utilizing any of the built-in methods available to your language, return the first word that is repeated in the 
given string.

## Approach & Efficiency
First step is to create a string array that will hold the each word of the given string, this is done by doing string split.
Next is to set an empty string variable `current` that will hold the value of a word. Now we have to use a HashMap so that 
we can get the key and value pairs for a comparison of the words. Now we loop through the array to give `current` the value
of the given word and store it to the HashMap. If the value is repeated we return `current` and if there are no repeated values 
we return `null`
## Acknowledgements
Luke and Will guided me through this challenge.

## Solution
Repeated Word ![Whiteboard solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/RepeatWord.jpeg)
