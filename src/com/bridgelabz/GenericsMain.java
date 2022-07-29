package com.bridgelabz;

public class GenericsMain {
    public static void main(String[] args) {

        MaxValue<Integer> maxValue1 = new MaxValue<>(35, 124, 327);
        maxValue1.testMaximum();
        System.out.println();

        MaxValue<Float> maxValue2 = new MaxValue<>(45.32F, 45.53F, 325.12F);
        maxValue2.testMaximum();
        System.out.println();

        MaxValue<String> maxValue3 = new MaxValue<>("Dog", "Tiger", "Antelope");
        maxValue3.testMaximum();
        System.out.println();
    }
}
