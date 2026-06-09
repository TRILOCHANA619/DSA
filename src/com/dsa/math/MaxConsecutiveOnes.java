package com.dsa.math;

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int consecutiveCount = 0;
        for(int num : nums){
            if(num == 1 ){
                consecutiveCount++;
                if(consecutiveCount> maxCount){
                    maxCount = consecutiveCount;
                }
            }else{
                consecutiveCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnes calc = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println("Input: " + java.util.Arrays.toString(nums));
        System.out.println("Output: " + calc.findMaxConsecutiveOnes(nums));
    }
}
