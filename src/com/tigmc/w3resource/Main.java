package com.tigmc.w3resource;

//https://www.w3resource.com/java-exercises/basic/index.php

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.Charset;

import java.io.BufferedReader;
import java.io.Console;

public class Main {

    public static void main(String[] args) {


        ex42();

    }

    private static void ex42() {

        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }

        System.out.print("Enter your username: ");
        String username = console.readLine();

        System.out.print("Enter your password: ");
        char[] password = console.readPassword();
        String strPwd = new String(password);

        String passport = console.readLine("Enter your %d (th) passport number: ", 2);

        System.out.println("Hi " + username + ", your password is " +  strPwd);
        System.out.println("Passport is " +  passport);

    }

    private static void ex41() {

                int chr = 'Z';
                System.out.println("The ASCII value of Z is :"+chr);
            }


    private static void ex40() {

                System.out.println("List of available character sets: ");
                for (String str : Charset.availableCharsets().keySet()) {
                    System.out.println(str);
                }
            }


    private static void ex39() {
        int amount = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                for(int k = 1; k <= 4; k++){
                    if(k != i && k != j && i != j){
                        amount++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + amount);
    }

    private static void ex38() {

        String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        String letter = "abcdefghijklmnopqrstuvwxyz";
        String space = " ";
        String number = "1234567890";
        String check = letter + space + number;
        int currentChar;
        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        for (int i = 0; i < input.length(); i++) {
            currentChar = (check.indexOf(input.toLowerCase().charAt(i)));


            if (currentChar < 0) {
                otherCount++;
            } else if (currentChar < 26) {
                letterCount++;
            } else if (currentChar == 26) {
                spaceCount++;
            } else numberCount++;


        }
        System.out.println("Letters - " + letterCount);
        System.out.println("Spaces - " + spaceCount);
        System.out.println("Numbers - " + numberCount);
        System.out.println("Others - " + otherCount);
    }

    private static void ex37() {
        String phrase = "The quick brown fox";
        StringBuilder reversed = new StringBuilder();
        for (int i = (phrase.length() - 1); i >= 0; i--) {
            reversed.append(phrase.charAt(i));

        }
        System.out.println(reversed);
    }

    private static void ex34() {
        int side = 6;
        double area = (6 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("A pentagon with side length of " + side + " has area of " + area);

    }

    private static void ex33() {
        int input = 332;
        int sum = 0;

        System.out.println("input is " + input);

        while (input > 0) {

            sum += input % 10;
            input = input / 10;

        }

        System.out.println("Sum of digits is " + sum);
    }

    private static void ex31() {
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.runtime.version"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("java.class.path"));

    }

    private static void ex18() {

        int decNo = 15;
        String hexNo = Integer.toHexString(decNo);
        System.out.println("Decimal is : " + decNo);
        System.out.println("Hex is : " + hexNo);
    }

    private static void ex17() {
        int x = 0b10;
        int y = 0b11;

        System.out.println(Integer.toBinaryString(x) + " + " + Integer.toBinaryString(y) + " = " + Integer.toBinaryString((x + y)) + " in binary");
    }

    private static void ex15() {

        int var1 = 4;
        int var2 = 7;
        int holdVar;

        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);
        System.out.println("I will now swap them!!");
        holdVar = var1;
        var1 = var2;
        var2 = holdVar;
        System.out.println("Variable 1 = " + var1);
        System.out.println("Variable 2 = " + var2);

    }

    private static void ex14() {
        String line1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String line2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(line1);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println(line2);
        }
    }


    private static void ex12() {

        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }

        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            total = total + Integer.valueOf(console.readLine());
        }

        double avg = (double) total / 5;

        System.out.println("Average = " + avg);
    }

    private static String circumference(double radius) {
        return Double.toString(2 * Math.PI * radius);
    }

    private static String area(double radius) {
        return Double.toString(Math.PI * Math.pow(radius, 2));
    }

    private static void timesTable(int firstNum) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(firstNum + " x " + i + " = " + (firstNum * i));
        }
    }

    private static void ex2() {
        System.out.println(74 + 36);
    }

    private static void ex3() {
        System.out.println(50 / 3);
    }

    private static void ex4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    private static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private static void subtract(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private static void mult(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    private static void div(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    private static void doMod(int num1, int num2) {
        System.out.println(num1 % num2);
    }
}
