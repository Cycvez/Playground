/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

import java.util.Arrays;

/**
 *
 * @author carlo
 */
public class RansomNote {

    public static void main(String[] args) {
        int nums[] = {2, 45, 7, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = 1;
        int returnArr[] = {i, j};
        int first = nums[i];
        int second = nums[j];
        
        while (first + second != target) {
            if (j <= nums.length) {
                i++;
                j = i + 1;
            }
            j++;
        }
        return returnArr;
    }
}
