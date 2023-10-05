package com.javabites.arrays.medium.longestconsecq.better;

import java.util.Arrays;

public class LongestConSeq2 {

    private static int longestConSeq(int[] a) {
        if(a.length == 0)
            return 0;
        int longest = 1;

        Arrays.sort(a);
        //for(int n : a)
        for(int i = 1; i < a.length; i++)
        {
            if(a[i-1] == a[i])
                continue;
            //if the current number is not a duplicate, use binary search
            int runningLongest = 1;
            int x = a[i-1];
            while (nextSeqExists(a, x + 1)) {
                runningLongest++;
                x++;
            }
            longest = Math.max(longest, runningLongest);
        }

        return longest;
    }

    //binary search
    private static boolean nextSeqExists(int[] a, int n) {

        int low = 0;
        int high = a.length - 1;
        while(low <= high) {
            int mid = (low + high) / 2;
            if(a[mid] == n)
                return true;
            else if(n > a[mid])
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3};
        System.out.println(longestConSeq(a));

    }
}
