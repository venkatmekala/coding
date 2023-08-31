package com.javabites.arrays.easy;

import java.util.HashSet;
import java.util.Set;

public class PairSumExistsInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 11;
        Set<Integer> s = new HashSet<>();
        for(int n : nums)
        {
            if(s.contains(k-n)) {
                System.out.println("pair exists");
                return;
            }
            s.add(n);
        }
    }
}
