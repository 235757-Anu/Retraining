package org.example;

import java.util.Comparator;

public class Frequency implements Comparator<Word>
{
    int result;
    public int compare(Word o1, Word o2)
    {
        if (o1.getCount() < o2.getCount())
        {
            result = 1;
        }
        else if (o1.getCount() > o2.getCount())
        {
            result = -1;
        }
        else if (o1.getCount() == o2.getCount())
        {
            result = o1.getWord().compareTo(o2.getWord());
        }
        return result;
    }
}
