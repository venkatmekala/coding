package com.javabites.arrays.easy.pairsum;

import java.util.HashSet;
import java.util.Set;

public class PairSumPrint {

    public static void main(String[] args) {
        int[] nums = {1, 2 , 3, 4, 5};
        int k = 6;
        Set<Integer> set = new HashSet<>();
        for(int n : nums){
            if(set.contains(k-n)) {
                System.out.println(k-n + "," + n);
            }
            set.add(n);
        }
    }
}
