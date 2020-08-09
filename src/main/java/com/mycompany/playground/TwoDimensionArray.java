/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author carlo
 */
public class TwoDimensionArray {

    static int hourglassS2Dum(int[][] arr) {
        List<Integer> addedArray = new ArrayList<>();

        for (int i = 0; i < arr.length-2; i++) {
            for (int j = 0; j < arr[0].length-2; j++) {
                int add = arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                addedArray.add(add);

            }
        }
        return Collections.max(addedArray);
    }

    public static void main(String[] args) {

        int[][] arr
                = {{1, 1, 1, 0, 0, 0},//rows are i columns are J
                {0, 1, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 2, 4, 4, 0},
                {0, 0, 0, 2, 0, 0},
                {0, 0, 1, 2, 4, 0}};

        int result = hourglassS2Dum(arr);
        System.out.println(result);
    }
}
