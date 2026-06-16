package com.dsa.math;

public class FindFirstOccuranceUsingRecursion  {
    public static int findFirstOccurance(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return findFirstOccurance(arr, target, index+1);
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 20};
        int target = 30;
        System.out.println("Input: " + java.util.Arrays.toString(arr) + ", Target: " + target);
        System.out.println("Output: " + findFirstOccurance(arr, target, 0));
    }
}
