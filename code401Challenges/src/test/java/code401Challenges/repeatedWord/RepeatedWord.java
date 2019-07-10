package code401Challenges.repeatedWord;

import java.util.HashMap;

public class RepeatedWord {

    public static String repeatedWord(String string){

        //creating an array to hold all the in their own index
        String[] words = string.split(" ");
        String current = "";

        // makes sure that the string has more than one word to compare with other words
        if (words.length < 1) throw new NullPointerException("Need a String with more than one word");

        HashMap<String, Integer> hashMap = new HashMap<>();

        //looping through the array to compare the value of the words
        for (String singleWord : words){

            //https://stackoverflow.com/questions/18830813/how-can-i-remove-punctuation-from-input-text-in-java
            current = singleWord.toLowerCase().replaceAll("[^a-zA-Z]+$", "");

            if (hashMap.containsKey(current)){

                return current;

            } else {

                hashMap.put(current, 1);

            }
        }
        return null;
    }
}
