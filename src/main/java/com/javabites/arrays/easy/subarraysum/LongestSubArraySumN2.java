package com.javabites.arrays.easy.subarraysum;

public class LongestSubArraySumN2 {
    int findLongestLengthOfArray(int[] nums, int k) {

        int maxLength = 0;
        for(int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
                sum += nums[j];
                if(k == sum)
                    maxLength = Math.max(maxLength, j - i + 1);

            }
        }
        return maxLength;
    }
}
