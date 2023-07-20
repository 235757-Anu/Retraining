package org.example;

public class Main {
        public static String isLeap(int y){
            if(y%4==0 && (y%100!=0 || y%400==0))
            {
                return "Leap Year";
            }
            else {
                return "Not a Leap Year";
            }
        }

}

