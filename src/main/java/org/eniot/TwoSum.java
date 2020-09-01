package org.eniot;

import java.util.Arrays;

/**
 * 问题：给一个有序数组nums[]，和一个目标值target。
 * 求nums中的两个数加起来等于target
 * @author xinqiu.hu
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(twoSum(nums, 10)));
        System.out.println(Arrays.toString(twoSum(nums, 11)));
    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int tmp = nums[left] + nums[right];
            if (tmp == target) {
                return new int[]{left, right};
            } else if (tmp < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
}
