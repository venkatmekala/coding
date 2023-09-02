package com.javabites.arrays.easy.pairsum;

import java.util.HashSet;
import java.util.Set;

public class PairSumCount {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, -1};
        int k = 3;
        int count = 0;
        Set<Integer> s = new HashSet<>();

        for(int n : nums) {
            if(s.contains(k-n))
                count++;
            s.add(n);
        }
        System.out.println(count);

    }
}
