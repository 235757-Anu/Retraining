package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class WordList
{
    List<Word> AddToList(ArrayList<String> list)
    {
        int count=0;
        List<Word> wordList = new ArrayList<Word>();
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.addAll(list);
        for (String str:treeSet)
        {
            count = Collections.frequency(list,str);
            wordList.add(new Word(str,count));
        }
        return wordList;
    }

    void showWordList(ArrayList<Word> wordList)
    {
        for (Word w:wordList)
        {
            System.out.println("Word "+w.getWord()+" occurs "+w.getCount()+" times.");
        }
    }

    void showFrequentWords(ArrayList<Word> wordList)
    {
        Collections.sort(wordList,new Frequency());
        for (Word w:wordList)
        {
            System.out.println("word "+w.getWord()+" occurs "+w.getCount()+" times.");
        }
    }

    void reverse(ArrayList<Word> wordList)
    {
        Collections.sort(wordList,new Reverse());
        for (Word w:wordList)
        {
            System.out.println("word "+w.getWord()+" occurs "+w.getCount()+" times.");
        }
    }

}
