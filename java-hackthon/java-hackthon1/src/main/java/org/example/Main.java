package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String filePath = "data/daffodils.txt";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = reader.readLine()) != null)
            {
                String[] wordsInLine = line.split("[,\\s]+");
                words.addAll(Arrays.asList(wordsInLine));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        WordList wordList = new WordList();
        ArrayList<Word> wordCounts = (ArrayList<Word>) wordList.AddToList(words);
        wordList.showWordList(wordCounts);
        System.out.println("\nFrequent Word\n");
        wordList.showFrequentWords(wordCounts);
        System.out.println("\nReverse Order\n");
        wordList.reverse(wordCounts);
    }
}