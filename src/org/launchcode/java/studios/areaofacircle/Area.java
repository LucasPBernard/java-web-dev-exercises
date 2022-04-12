package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {


        double a;
        double pi = 3.14;
        int r;
        Scanner input = new Scanner(System.in);
        System.out.println("What is your radius?");
        r = input.nextInt();
        input.close();
        a = pi * r * r;
        System.out.println("The area of the circle of radius "+r+"is: "+a);
//        String test = `The radius of the circle ${r}`;
        System.out.printf("The radius of the circle %d",r);
    }
}