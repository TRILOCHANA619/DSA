package com.dsa.math;

public class FindGreatestCommonDivisorOfArray {
    public static int findGCD(int[] nums) {
//
//        //find the highest and lowest number
//        int max = nums[0];
//        int min = max;
//        for (int num :nums){
//            if(num > max){
//                max = num;
//            }
//            if(num<min) {
//                min = num;
//            }
//        }
//        int GCD = 1;
//        System.out.println(max + " , "+ min);
//        for(int i = 2;  i<= min; i++){
//            if( max % i == 0 && min % i == 0){
//                GCD = i;
//            }
//        }
//
//
//        return GCD;

        int max = nums[0];
        int min = max;
        for (int num :nums){
            if(num > max){
                max = num;
            }
            if(num<min) {
                min = num;
            }
        }
        while (min != 0) {
            int temp = min;
            min = max % min;
            max = temp;
        }



        return max;
    }

    public static void main(String[] args) {
        System.out.println(findGCD(new int[]{2,3,4,5,10}));
    }
}
