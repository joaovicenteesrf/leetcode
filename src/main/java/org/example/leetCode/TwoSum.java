package org.example.leetCode;

import java.util.*;

public class TwoSum {

    public int[] twoSumm(int[] nums, int target) {

        // Solução O(n), melhor solução e mais eficiente possível


        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int complement = target - num;

            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }

            numToIndex.put(num, i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
