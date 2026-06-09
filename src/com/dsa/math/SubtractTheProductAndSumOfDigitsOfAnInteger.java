package com.dsa.math;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while(n !=0){
            int temp = n%10;
            product *=temp;
            sum += temp;
            n/=10;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger calc = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        int n = 234;
        System.out.println("Input: " + n);
        System.out.println("Output: " + calc.subtractProductAndSum(n));
    }
}
