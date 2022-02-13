package com.leetcode;

public class Main {

    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {

            int a = 3;
            int b = 7;
            int c = 11;

            boolean truea = (i % a == 0);
            boolean trueb = (i % b == 0);
            boolean truec = (i % c == 0);
            boolean falseabc = (i % a != 0 && i % b != 0 && i % c != 0);

            if (truea) {
                System.out.println("Broj je djeljiv s 3.");
            } else if (trueb) {
                System.out.println("Broj je djeljiv sa 7.");
            } else if (truec) {
                System.out.println("Broj je djeljiv sa 11.");
            } else if (falseabc) {
                System.out.println("Broj nije djeljiv.");
            }
        }
    }
}