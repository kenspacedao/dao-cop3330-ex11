package base;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Kenny Dao
 */
public class App {
    public static void main(String[] args)
    {
        System.out.print("How many euros are you exchanging? ");
        Scanner scan = new Scanner(System.in);
        double euros = scan.nextDouble();

        System.out.print("What is the exchange rate? ");
        double rate = scan.nextDouble();

        double conv = rate * euros;

        System.out.print(euros + " euros at an exchange rate of " + rate + " is " + conv + " U.S. dollars.");
    }
}
