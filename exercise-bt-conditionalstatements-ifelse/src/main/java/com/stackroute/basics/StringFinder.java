package com.stackroute.basics;
import java.util.*;

public class StringFinder {
    //Create Scanner object as instance variable
    Scanner s=new Scanner(System.in);

    public static void main(String[] args) {
        //Get three strings from the user
        new StringFinder().getInput();
    }

    public String getInput() {

        String searchString=s.nextLine();
        String firstString=s.nextLine();
        String secondSting=s.nextLine();
        int r =findString(searchString,firstString,secondSting);
        displayResult(r);
        return null;

    }

    public void displayResult(int result) {
        //displays the result
        if(result==-1)
        {
            System.out.println("Empty string or null");
        }
        else if(result==0)
        {
            System.out.println("Not found");
        }
        else {
            System.out.println("found as expected");
        }

    }

    public int findString(String searchString, String firstString, String secondString)
    {
        if(searchString==null || firstString==null || secondString==null)
        {
            return -1;
        }
        else if(searchString.isEmpty() || firstString.isEmpty() || secondString.isEmpty())
        {
            return -1;
        }
        else
        {
            int pos1=searchString.indexOf(firstString);
            int pos2=searchString.indexOf(secondString);
            if(pos1<pos2 && pos1!=-1 && pos2!=-1)
            {
                return 1;
            }
            else {
                return 0;
            }
        }
    }

    public void closeScanner() {
        s.close();
    }
}
