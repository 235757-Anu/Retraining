package com.stackroute.basics;


import java.util.Scanner;

public class SortAscNumber {


    public static void main(String[] args) {
        new SortAscNumber().getNumbers();
    }

    //get the numbers from user through console
    public void getNumbers() {

        Scanner s=new Scanner(System.in);
        int firstNumber=s.nextInt();
        int secondNumber=s.nextInt();
        int thirdNumber=s.nextInt();
        int fourthNumber=s.nextInt();
        System.out.println(numberSorter(firstNumber,secondNumber,thirdNumber,fourthNumber));

    }

    //logic to sort the numbers
    public String numberSorter(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {

        int temp1=0,temp2=0,pos1=0,pos2=0,pos3=0,pos4;
        String result="Sorted:{";

        if(firstNumber<=secondNumber && firstNumber<=thirdNumber && firstNumber<=fourthNumber)
        {
            pos1=firstNumber;
        }
        else
        {
            if(secondNumber<=firstNumber && secondNumber<=thirdNumber && secondNumber<=fourthNumber)
            {
                pos1=secondNumber;
            }
            else
            {
                if (thirdNumber <= firstNumber && thirdNumber <= secondNumber && thirdNumber <= fourthNumber)
                {
                    pos1 = thirdNumber;
                }
                else
                {
                    pos1 = fourthNumber;
                }
            }
        }

        if(firstNumber>=secondNumber && firstNumber>=thirdNumber && firstNumber>=fourthNumber)
        {
            pos4=firstNumber;
        }
        else
        {
            if(secondNumber>=firstNumber && secondNumber>=thirdNumber && secondNumber>=fourthNumber)
            {
                pos4=secondNumber;
            }
            else
            {
                if (thirdNumber >= firstNumber && thirdNumber >= secondNumber && thirdNumber >= fourthNumber)
                {
                    pos4 = thirdNumber;
                }
                else {
                    pos4 = fourthNumber;
                }
            }
        }

        temp1=pos1;
        temp2=pos4;

        if(firstNumber!=pos1 && firstNumber!=pos4)
        {
            temp1=firstNumber;
            if(secondNumber!=pos1 && secondNumber!=pos4)
            {
                temp2=secondNumber;
            }
            else if(thirdNumber!=pos1 && thirdNumber!=pos4)
            {
                temp2=thirdNumber;
            }
            else
            {
                temp2=fourthNumber;
            }
        }

        if(secondNumber!=pos1 && secondNumber!=pos4)
        {
            temp1=secondNumber;
            if(firstNumber!=pos1 && firstNumber!=pos4)
            {
                temp2=firstNumber;
            }
            else if(thirdNumber!=pos1 && thirdNumber!=pos4)
            {
                temp2=thirdNumber;
            }
            else
            {
                temp2=fourthNumber;
            }
        }

        if(thirdNumber!=pos1 && thirdNumber!=pos4)
        {
            temp1=thirdNumber;
            if(firstNumber!=pos1 && firstNumber!=pos4)
            {
                temp2=firstNumber;
            }
            else if(secondNumber!=pos1 && secondNumber!=pos4)
            {
                temp2=secondNumber;
            }
            else
            {
                temp2=fourthNumber;
            }
        }

        if(fourthNumber!=pos1 && fourthNumber!=pos4)
        {
            temp1=fourthNumber;
            if(firstNumber!=pos1 && firstNumber!=pos4)
            {
                temp2=firstNumber;
            }
            else if(thirdNumber!=pos1 && thirdNumber!=pos4)
            {
                temp2=thirdNumber;
            }
            else
            {
                temp2=secondNumber;
            }
        }

        if(temp1<=temp2)
        {
            pos2=temp1;
            pos3=temp2;
        }
        else
        {
            pos2=temp2;
            pos3=temp1;
        }

        result=result+pos1+","+pos2+","+pos3+","+pos4+"}";
        return result;

    }
}

