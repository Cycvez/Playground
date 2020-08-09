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
public class NewYearsChaos {

    static void minimumBribes(int[] q) {
        int size = q.length;
        int[] original = new int[size];
        int[] temp= new int [size];
        int count=0;
        for (int i = 0; i < size; i++) {
            original[i] = i + 1;
        }
        while(original!=q){
            
        }
        System.out.println(Arrays.toString(original));
    }

    public static void main(String[] args) {
        int[] q = {5, 3, 2, 1, 4};
        minimumBribes(q);
    }

}
