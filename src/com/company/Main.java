package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner litScanner = new Scanner(System.in);


        System.out.println("You better pay me $10 dollars by tomrrow or else!");
        System.out.println( "(The next day)");
        System.out.println("Pay up");
        Scanner money = new Scanner(System.in);
        int Money = money.nextInt();


        if (Money > 1) {
            System.out.println("That's what I thought ");

        } else {
            System.out.println("You are getting the beat down!");
        }


    }
}
