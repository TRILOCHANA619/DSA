package com.dsa.math;

public class WaysToTileAFlore {
    public static int countWaysToTile(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return countWaysToTile(n-1) + countWaysToTile(n-2);
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Input: " + n);
        System.out.println("Output: " + countWaysToTile(n));
    }
}
