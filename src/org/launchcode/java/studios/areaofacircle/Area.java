package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {


        Double a;
        Double pi = 3.14159265;
        Double r;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your radius?");
        r = input.nextDouble();
        input.close();
//        a = pi * r * r;
        a = Circle.getArea(r);
        System.out.println("The radius of the circle "+r);

        System.out.println("The area of the circle of radius "+r+" is: "+a);
//        String test = `The radius of the circle ${r}`;
    }
}