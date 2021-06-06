/*
 *  UCF COP3330 Summer 2021 Assignment 18 Solution
 *  Copyright 2021 Sabirah Salau
 */


package org.example;


import java.util.Scanner;
public class Problem18
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        String choice = input.next().toUpperCase();

        System.out.println("Your choice: " + choice);

        int temp;

        if(choice.equals("C"))
        {
            System.out.println("Please enter the temperature in Fahrenheit:");
            temp = input.nextInt();
            double C = (temp - 32) * (5.0/9.0);

            System.out.println("The temperature in Celsius is: " + C);
        }
        else if (choice.equals("F"))
        {
            System.out.println("Please enter the temperature in Celsius:");
            temp = input.nextInt();
            double F = (temp * 9.0/5.0) + 32;

            System.out.println("The temperature in Fahrenheit is: " + F);
        }
        else
        {
            System.out.println("Invalid input.");
        }


    }
}
