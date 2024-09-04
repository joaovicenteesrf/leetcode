package org.example;

import org.example.leetCode.arrayAndString.RemoveDuplicatesFromSortedArray04;
import org.example.leetCode.arrayAndString.RemoveElement03;

public class Main {
    public static void main(String[] args) {

        RemoveDuplicatesFromSortedArray04 solution = new RemoveDuplicatesFromSortedArray04();

        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        solution.removeDuplicates(nums);
    }
}