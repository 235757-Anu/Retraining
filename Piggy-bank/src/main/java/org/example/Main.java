package org.example;

public class Main {
    public static void main(String[] args){
        System.out.println(NumberOfDays(2050,1200,10));
    }
    public static int NumberOfDays(int cost, int savings, int start) {
        int count=0,a=0;
        while(savings<=cost){
            a=start;
            for(int i=0;i<=7;i++){
                savings=savings+a;
                a++;
                count++;
                if(savings>=cost)
                    break;
            }
            start++;
        }
        return count;
    }
}