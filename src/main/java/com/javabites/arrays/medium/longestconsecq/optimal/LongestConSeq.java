package com.javabites.arrays.medium.longestconsecq.optimal;

import java.util.HashSet;
import java.util.Set;

public class LongestConSeq {

    static int longestConSeq(int[] a) {
        if(a.length == 0)
            return 0;
        int longest = 1;
        Set<Integer> set = new HashSet<>();
        for(int n : a)
            set.add(n);

        for(int n : set) {
            int x = n;
            int runningLongest = 1;
            if(!set.contains(x-1)) {
                while(set.contains(x+1)) {
                    runningLongest++;
                    x++;
                }
            }
            longest = Math.max(longest, runningLongest);
        }

        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100, 200, 5, 3, 2, 1, 4};
        System.out.println(longestConSeq(a));
    }
}
