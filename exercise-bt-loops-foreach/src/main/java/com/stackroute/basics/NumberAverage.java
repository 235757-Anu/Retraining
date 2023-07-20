package com.stackroute.basics;
import java.util.Scanner;


public class NumberAverage {

    public static void main(String[] args)
    {
        new NumberAverage().getArrayValues();
    }

    //get the values of the array from the user
    public void getArrayValues() {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int [] arr = new int[limit];
        for(int i=0;i<limit;i++){
            arr[i]=s.nextInt();
        }
        System.out.println(findAverage(arr));
    }

    //write here logic to calculate the average an array
    public String findAverage(int[] inputArray) {

        int f =0,sum=0;
        if(inputArray.length==0)
        {
            return "Empty array";
        }
        for (int i : inputArray)
        {
            if(i<0)
            {
                f = 1;
                break;
            }
            else
            {
                sum = sum+i;
            }
        }
        if(f==0)
        {
            return "The average value is: " + sum / inputArray.length;
        }
        else {
            return "Give proper positive integer values";
        }

    }
}
