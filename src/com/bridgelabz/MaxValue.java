package com.bridgelabz;

public class MaxValue {

    void maxValue(String num1, String num2, String num3) {

        if ((num1.compareTo(num2)) >= 0 && (num1.compareTo(num3)) >= 0)
            System.out.println(num1 + " is the largest number");

        else if ((num2.compareTo(num1)) >= 0 && (num2.compareTo(num3)) >= 0) {
            System.out.println(num2 + " is largest");
        } else {
            System.out.println(num3 + " is largest");
        }
    }
}
