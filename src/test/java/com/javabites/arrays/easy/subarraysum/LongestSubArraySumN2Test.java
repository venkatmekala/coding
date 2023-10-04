package com.javabites.arrays.easy.subarraysum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubArraySumN2Test {

    @Test
    public void testLengthOfLongestSubArrayWhoseSumEqualsToK() {

        int[] nums = {-5, 8, -14, 2, 4, 12};
        int k = -5;
        LongestSubArraySumN2 ref = new LongestSubArraySumN2();
        Assertions.assertEquals(6, ref.findLongestLengthOfArray(nums, k));

    }
}
