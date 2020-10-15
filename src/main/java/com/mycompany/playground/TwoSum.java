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
public class TwoSum {
    public static int[] sum(int[] nums, int target){
        int[] answer = new int[2];
        
        for (int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length;j++){
               if (nums[i]+nums[j]==target){
                   answer[0]=i;
                   answer[1]=j;
               }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] answer = {3,2,4};
        int target = 6;
       
        System.out.println(Arrays.toString(sum(answer,target)));
    }
}
