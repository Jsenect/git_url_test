package com.gx.test;

import java.util.LinkedHashMap;

/**
 * @author zzl
 * @Date 2020/5/9 16:45
 * 两数之和
 */
public class Solution {


    public int[] twoSum(int[] nums, int target) {
        LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                //坐标和对应值
                hashMap.put(nums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int i1 = target - nums[i];
            if (hashMap.containsKey(i1) && hashMap.get(i1) != i) {
                return new int[]{i, hashMap.get(i1)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
