package com.dsa.math;

public class FactorialOfNUsingRecusion {
    public static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Input: " + n);
        System.out.println("Output: " + factorial(n));
    }
}
