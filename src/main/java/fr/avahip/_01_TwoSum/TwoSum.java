package fr.avahip._01_TwoSum;

import java.util.Arrays;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // LeetCode - https://leetcode.com/problems/two-sum/description/
        System.out.println("https://leetcode.com/problems/two-sum/description/");
        // Case 1 - nums : [2,7,11,15], target : 9
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

        // Case 2 - nums : [3, 2, 4], target : 6
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));

        // Case 3 - nums : [3, 3], target : 6
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));

    }
}
