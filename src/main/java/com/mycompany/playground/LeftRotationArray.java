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
public class LeftRotationArray {

    static int[] rotLeft(int[] a, int d) {

        int size = a.length;
        int[] newArray = new int[size];

        int i = 0;
        int rotatedIndex = d;

        while (rotatedIndex < size) {
            newArray[i] = a[rotatedIndex];
            i++;
            rotatedIndex++;
        }

        rotatedIndex = 0;
        while (rotatedIndex < d) {
            newArray[i] = a[rotatedIndex];
            i++;
            rotatedIndex++;
        }
        return newArray;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotate = 2;

        System.out.println(Arrays.toString(rotLeft(arr, rotate)));
    }

}
