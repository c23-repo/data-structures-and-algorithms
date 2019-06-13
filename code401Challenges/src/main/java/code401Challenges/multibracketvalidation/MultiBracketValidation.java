package code401Challenges.multibracketvalidation;

import code401Challenges.stacksandqueues.Stack;

public class MultiBracketValidation {


    public static boolean multiBracketValidation(String input){

        // creating an instance of a Stack
        Stack bracketHolder = new Stack();

        // Looping through the input string by character using charAt.
        for (int i = 0; i < input.length(); i++) {

            char bracket = input.charAt(i);

            // checking a given character that it is the opening bracket
            // then storing it into a stack
            if (bracket == '(') bracketHolder.push("(");
            if (bracket == '{') bracketHolder.push("{");
            if (bracket == '[') bracketHolder.push("[");

            //Once a closing bracket is found, conditional checks against the stack.
            //Since the brackets must be in sequence, we check the top of the stack.
            //if a match we pop, if not return false.
            if(bracket == ')'){
                if (bracketHolder.top.data == "("){
                    bracketHolder.pop();
                } else {
                    return false;
                }
            }

            if(bracket == '}'){
                if (bracketHolder.top.data == "{"){
                    bracketHolder.pop();
                } else {
                    return false;
                }
            }

            if(bracket == ']'){
                if (bracketHolder.top.data == "["){
                    bracketHolder.pop();
                } else {
                    return false;
                }
            }
            
        }

        //finally check the stack one more time to see if it is null.
        //if null, all brackets had a pair in sequence.
        //else it did not have a second pair and we return false.
        if (bracketHolder.top == null) {
            return true;
        } else {
            return false;
        }
    }
}
