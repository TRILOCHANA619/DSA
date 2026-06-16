package com.dsa.math;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, result, target, new ArrayList<Integer>(), 0);
        return result;
    }

    private void backtrack(int[] candidates, List<List<Integer>> result, int target,
                           ArrayList<Integer> integers, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(integers));
            return;
        }
        if(target < 0){
            return;
        }
        for(int i = index; i< candidates.length; i++){
            integers.add(candidates[i]);
            backtrack(candidates, result, target - candidates[i], integers, i);
            integers.remove(integers.size() - 1);
        }
    }

    // Simple main to demonstrate combinationSum
    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        // Example input; change as needed
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = cs.combinationSum(candidates, target);

        System.out.println("Combinations for target " + target + ":" + result);

    }
}
