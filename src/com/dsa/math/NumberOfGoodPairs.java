package com.dsa.math;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
//           int count = 0;
//           for (int i = 0; i< nums.length; i++){
//               for(int j = i+1; j <= nums.length; j++){
//                   if (nums[i] == nums[j]){
//                       count++;
//                   }
//               }
//           }
//           return count;

        int[] freq = new int[101];
        int count = 0;
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }

    public static void main(String[] args) {
        NumberOfGoodPairs calc = new NumberOfGoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        int goodPairs = calc.numIdenticalPairs(nums);
        System.out.println("Input: " + java.util.Arrays.toString(nums));
        System.out.println("Number of good pairs = " + goodPairs);
    }
}
