package com.bridgelabz;

public class MaxValue<T extends Comparable<T>> {

    T val1, val2, val3;

    public MaxValue(T val1, T val2, T val3) {
        this.val1 = val1;
        this.val2 = val2;
        this.val3 = val3;
    }

    public void testMaximum(){
        testMaximum(val1, val2, val3);
    }
    static <K extends Comparable<K>>void testMaximum(K val1, K val2, K val3) {

        if ((val1.compareTo(val2)) >= 0 && (val1.compareTo(val3)) >= 0)
            System.out.println(val1 + " is the largest");

        else if ((val2.compareTo(val1)) >= 0 && (val2.compareTo(val3)) >= 0) {
            System.out.println(val2 + " is largest");
        } else {
            System.out.println(val3 + " is largest");
        }
    }
}
