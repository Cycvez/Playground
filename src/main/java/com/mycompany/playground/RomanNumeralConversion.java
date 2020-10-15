/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class RomanNumeralConversion {

    public static void main(String[] args) {
        int[] trythis = {1,2,3,4};
        System.out.println(permutes(trythis));

    }
    
    public static List<List<Integer>> permutes(int[] nums){
        List<List<Integer>> allPermutations= new ArrayList<>();
        
        List<Integer> temp= new ArrayList<>();
        
        for(int i =0; i<nums.length; i++){
            temp.clear();
            temp.add(nums[i]);
            for (int j=0;j<nums.length; j++){
                if (i==j){
                    continue;
                }
                temp.add(nums[j]);
            }
            allPermutations.add(temp);
            
        }
        return allPermutations;
    }

}
