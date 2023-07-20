package com.stackroute.strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram {
    //write logic to check given two phrases are anagrams or not and return result
    public String checkAnagrams(String phraseOne, String phraseTwo)
    {
        if(phraseOne.isEmpty() || phraseTwo.isEmpty())
        {
            return "Give proper input not empty phrases";
        }
        char[] String1=phraseOne.toCharArray();
        char[] String2=phraseTwo.toCharArray();

        Arrays.sort(String1);
        Arrays.sort(String2);

        if(Arrays.equals(String1,String2))
        {
            return "Given phrases are anagrams";
        }
        else
        {
            return "Given phrases are not anagrams";
        }

    }
}
