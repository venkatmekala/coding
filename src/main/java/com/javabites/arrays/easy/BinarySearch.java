package com.javabites.arrays.easy;

public class BinarySearch {

    public static void main(String[] args) {
        //sorted array
        int[] nums = {2, 3, 4, 5, 6};
        int k = 9;
        int idx = binSearch(nums, k);

        System.out.println(idx);
    }

    static int binSearch(int[] nums, int k) {
        int start = 0; int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == k)
                return mid + 1;
            else if(nums[mid] > k)
                end--;
            else if(nums[mid] < k)
                start++;
        }

        return -1;
    }
}
