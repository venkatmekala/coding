package com.javabites.arrays.medium.longestconsecq.bruteforce;

public class LongestConSeq {

    static int longestConSeq(int[] nums) {
        if(nums.length == 0)
            return 0;
        int longest = 1;
        for(int e : nums) {
            int runningLongest = 1;
            int x = e;
            while(linearSearch(x + 1, nums)) {
                x++;
                runningLongest++;
            }
            longest = Math.max(longest, runningLongest);

        }
        return longest;
    }

    static boolean linearSearch(int n, int[] nums) {
        for(int i : nums)
            if(n == i)
                return true;
        return false;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 1, 2, 3, 4};
        System.out.println(longestConSeq(a));
    }
}
