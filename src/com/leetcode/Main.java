package com.leetcode;

public class Main {
    public static boolean isDivisable(int djeljenik, int djeljitelj) {
        if (djeljenik % djeljitelj == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printResult(int i, int a, int b, int c) {
        if (isDivisable(i, a)) {
            System.out.println(i + " je djeljiv sa " + a);
        }
        else if (isDivisable(i, b)) {
            System.out.println(i + " je djeljiv sa " + b);
        }
        else if (isDivisable(i, c)) {
            System.out.println(i + " je djeljiv sa " + c);
        }
        else {
            System.out.println(i + " nije djeljiv sa ni jednim brojem");
        }
    }

    public static void printRange(int start, int stop, int a, int b, int c) {
        for (int i = start; i <= stop; i++) {
            printResult(i, a, b, c);
        }
    }


    public static void main(String[] args) {
        printRange(10, 20, 3, 7, 11);
    }
}