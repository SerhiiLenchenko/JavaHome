package com.company;
import java.util.Scanner;
/**
 * Created by fishes on 3/18/2017.
 */
public class Prompt {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);

        String firstNumber;
        System.out.print("Enter your first number");
        firstNumber = user_input.next();

        String secondNumber;
        System.out.print("Enter your second number");
        secondNumber = user_input.next();

        String thirdNumber;
        System.out.print("Enter your second number");
        thirdNumber = user_input.next();

        char cChar;
        System.out.print("Enter your first number");
        cChar = user_input.next(".").charAt(0);

        String yourNumbers;
        yourNumbers = firstNumber + " " + secondNumber + " " + thirdNumber+ " " + cChar;

        System.out.println("yourNumbers -  "+ yourNumbers);


    }
}
