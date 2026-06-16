package com.dsa.math;

public class PrintOneToNInDecreasing {
    public static void printOntToNInDecreasing(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        printOntToNInDecreasing(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Input: " + n);
        System.out.print("Output: ");
        printOntToNInDecreasing(n);
    }
}
