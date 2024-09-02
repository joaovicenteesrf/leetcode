package org.example;

import org.example.leetCode.TwoSum;

public class Main {
    public static void main(String[] args) {

        TwoSum solution = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = solution.twoSumm(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}