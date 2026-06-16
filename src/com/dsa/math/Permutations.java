package com.dsa.math;

import java.util.ArrayList;
import java.util.List;

//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
//    public List<List<Integer>> permute(int[] nums) {
//        System.out.println("Starting permutation for nums: " + java.util.Arrays.toString(nums));
//        List<List<Integer>> result = new ArrayList<>();
//        backtrack(nums, new ArrayList<>(), result);
//        System.out.println("Final result: " + result);
//        return result;
//    }
//
    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> result) {
        System.out.println("  Entering backtrack: current=" + current + ", size=" + current.size() + ", target=" + nums.length);
        if (current.size() == nums.length) {
            System.out.println("    ✓ Complete permutation found: " + current);
            result.add(new ArrayList<>(current));
            System.out.println("    Added to result. Total permutations so far: " + result.size());
            return;
        }
//
        for (int i = 0; i < nums.length; i++) {
            if (!current.contains(nums[i])) {
                System.out.println("    Adding nums[" + i + "]=" + nums[i] + " to current");
                current.add(nums[i]);
                backtrack(nums, current, result);
                System.out.println("    Removing nums[" + i + "]=" + nums[i] + " from current (backtrack)");
                current.remove(current.size() - 1);
            } else {
                System.out.println("    Skipping nums[" + i + "]=" + nums[i] + " (already in current)");
            }
        }
        System.out.println("  Exiting backtrack: current=" + current);
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        backTrack(nums, result, visited, new ArrayList<Integer>(nums.length));
        return result;
    }

    public void backTrack(int[] nums, List<List<Integer>> result, boolean[] visited, List<Integer> curr){
        if(curr.size() == nums.length){
            result.add(new ArrayList<>(curr));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(!visited[i]){
                curr.add(nums[i]);
                visited[i] = true;
                backTrack(nums, result, visited, curr);
                visited[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Permutations p = new Permutations();
        int[] nums = {1, 2, 3};
        System.out.println("\n========== PERMUTATION TRACE ==========\n");
        List<List<Integer>> result = p.permute(nums);
        System.out.println("\n========== FINAL OUTPUT ==========");
        System.out.println("Total permutations: " + result.size());
        System.out.println("Result: " + result);
    }
}
