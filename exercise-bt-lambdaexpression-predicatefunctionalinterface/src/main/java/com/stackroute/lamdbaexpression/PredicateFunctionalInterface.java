package com.stackroute.lamdbaexpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterface {
    //write logic to find the values that starts with letter I in the given list
    public List<String> findPattern(List<String> list) {
        if (list == null || list.isEmpty()) {
            return list;
        }
        List<String> result = new ArrayList<>();
        Predicate<String> startsWithI = s -> s.startsWith("I");
        for (String s : list)
        {
            if(startsWithI.test(s) && !result.contains(s))
            {
                result.add(s);
            }
        }
        return result;
    }
}
