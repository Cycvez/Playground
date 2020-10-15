/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

/**
 *
 * @author carlo
 */
public class NonDecreasingOrder {

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 3};
        System.out.println(height(heights));
    }

    public static int height(int[] heights) {
        int counter = 0;
        int max = heights.length;
        int temp = 0;

        for (int i = 0; i < max-1 ; i++) {
            for (int j = 1; j < max-1-i; j++) {
                if (heights[j] > heights[j+1]) {
                    temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1]= temp;
                    counter++;
                }

            }
        }
        return counter;
    }
}
