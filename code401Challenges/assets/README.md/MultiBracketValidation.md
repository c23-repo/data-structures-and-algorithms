#MultiBracketValidation
A function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:
- Round Brackets : ()
- Square Brackets : []
- Curly Brackets : {}

## API
- Creating an instance of a Stack.
- Looping through the input string by character using charAt.
- Checking a given character that it is the opening bracket, then storing it into a stack.
- Once a closing bracket is found, conditional checks against the stack.
- Since the brackets must be in sequence, we check the top of the stack.
- If a match we pop, if not return false.
- Finally check the stack one more time to see if it is null.
- If null, all brackets had a pair in sequence.
- Else it did not have a second pair and we return false.

## Whiteboard Solution
- Multibracket Validator Whiteboard: ![MultibracketValidator Whiteboard Solution](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/assets/img/MultiBracketValidation.jpg)

## Code Solution
[Multibracket Validator Code](https://github.com/c23-repo/data-structures-and-algorithms/blob/master/code401Challenges/src/main/java/code401Challenges/multibracketvalidation/MultiBracketValidation.java)
