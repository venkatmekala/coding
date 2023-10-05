package com.javabites.arrays.medium.longestconsecq.better;

import java.util.Arrays;

public class LongestConSeq1 {

    static int conLongestSeq(int[] a) {
        if(a.length == 0)
            return 0;
        int longest = 1;

        Arrays.sort(a);
        int currentSmallest = a[0];
        int cnt = 1;
        for(int i = 1; i < a.length; i++) {
            if(a[i] == currentSmallest + 1) {
                cnt++;
                currentSmallest = a[i];
            }
            else {
                cnt = 1;
                currentSmallest = a[i];
            }

            longest = Math.max(longest, cnt);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] a = {100, 200, 5, 3, 2, 1, 4};
        System.out.println(conLongestSeq(a));
    }
}
