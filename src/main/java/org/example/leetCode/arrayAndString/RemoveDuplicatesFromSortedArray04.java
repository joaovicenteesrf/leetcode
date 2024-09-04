package org.example.leetCode.arrayAndString;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray04 {

    public int removeDuplicates(int[] nums) {

        int left = 0;

        for (int right = 1; right < nums.length; right++) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
        }


        System.out.println(left + 1);
        System.out.println(Arrays.toString(nums));
        return left + 1;


    }
}
