package com.example;

/**
 * Created by aurora on 12/1/15.
 */
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.printf("Enter i:  ");
        int i = in.nextInt();
        System.out.println(i);
        String str;
        if(i>=0 && i<=59)
        {
            str = "F";
        }
        else if(i>=60 && i<=69)
        {
            str = "D";
        }
        else if(i>=70 && i<=79)
        {
            str = "C";
        }
        else if(i>=80 && i<=89)
        {
            str = "B";
        }
        else if(i>=90 && i<=100)
        {
            str = "A";
        }
        else
        {
            str = "Estimate is not correct";
        }
        System.out.println(str);
    }
}