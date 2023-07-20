package com.stackroute.basics;

import java.util.*;

public class RectanglePerimeter {
    public static void main(String[] args) {
        new RectanglePerimeter().getValues();
    }

    //get user input from console
    public void getValues() {

        Scanner s=new Scanner(System.in);
        double length=s.nextDouble();
        double breadth=s.nextDouble();
        double result=perimeterCalculator(length,breadth);
        System.out.println(result);

    }

    //write logic to find perimeter of rectangle here
    public double perimeterCalculator(double length, double breadth) {
        double result=2*(length+breadth);
        return result;
    }
}
