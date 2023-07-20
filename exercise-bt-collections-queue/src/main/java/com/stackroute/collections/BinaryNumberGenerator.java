package com.stackroute.collections;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumberGenerator {
    //write logic to find binary number from 1 to given input
    public String findBinaryNumbersSequence(int input)
    {
        if(input<=0)
        {
            return "Give proper input not zero or negative";
        }
        if(input>20)
        {
            return "Give proper input not greater than 20";
        }
        Queue<String> queue = new LinkedList<>();
        String result="";
        for(int i=1;i<=input;i++){
            queue.add(Integer.toBinaryString(i));
            result=result+queue.poll();
            if(i!=input){
                result=result+" ";
            }
        }
        return result;
    }
}