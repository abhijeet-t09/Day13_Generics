package com.bridgelabz;

public class GenericsMain {
    public static void main(String[] args) {

        MaxValue maxVal = new MaxValue();
        System.out.println("Integer Test Case");
        maxVal.maxValue(35, 124, 327);
        System.out.println();

        System.out.println("Float Test Case");
        maxVal.maxValue(45.32F, 45.53F, 325.12F);
        System.out.println();

        System.out.println("String Test Case");
        maxVal.maxValue("Dog", "Tiger", "Antelope");
        System.out.println();
    }
}
