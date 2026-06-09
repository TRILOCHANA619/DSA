package com.dsa.math;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int l = 0;
        int r= nums.length-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(nums[mid]== target){
                return mid;
            }
           else if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }

            }else{
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }

            }
        }
        return -1;
    }

    // main added for quick testing
    public static void main(String[] args) {
        SearchInRotatedSortedArray solver = new SearchInRotatedSortedArray();

        int[] nums1 = {4,5,6,7,0,1,2};
        System.out.println("Array: " + java.util.Arrays.toString(nums1));
        System.out.println("search(nums1, 0) = " + solver.search(nums1, 0));
        System.out.println("search(nums1, 3) = " + solver.search(nums1, 3));

        int[] nums2 = {1};
        System.out.println("Array: " + java.util.Arrays.toString(nums2));
        System.out.println("search(nums2, 1) = " + solver.search(nums2, 1));
    }
}
