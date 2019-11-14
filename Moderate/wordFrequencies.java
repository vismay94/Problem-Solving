package Moderate;

import java.util.ArrayList;
import java.util.HashMap;

public class wordFrequencies {

    public ArrayList<Integer> wordFrequency(String[] book, String[] words){

        HashMap<String,Integer> countMap = new HashMap<String, Integer>();
        ArrayList<Integer> count = new ArrayList<Integer>();
//        Get word count of all words of book, store the count into dictionary
        for(String word: book){
            if(countMap.containsKey(word)){
                countMap.put(word,countMap.get(word)+1);
            }
            else{
                countMap.put(word,1);
            }
        }
//        Get count from dictionary and add it to array list. Return the list.
        for(String word: words){
            if(countMap.containsKey(word)){
                count.add(countMap.get(word));
            }
        }
        return count;
    }
}
