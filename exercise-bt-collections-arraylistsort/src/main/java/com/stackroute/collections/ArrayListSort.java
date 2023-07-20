package com.stackroute.collections;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;

public class ArrayListSort
{
    //write logic to sort given list in descending order
    public ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> list)
    {
        Comparator<BigInteger> descendingOrder = new Comparator<BigInteger>()
        {
            public int compare(BigInteger o1, BigInteger o2)
           {
                return o2.compareTo(o1);
           }
        };
        list.sort(descendingOrder);
        return list;
    }
}
