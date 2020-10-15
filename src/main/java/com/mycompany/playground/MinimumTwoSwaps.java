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
public class MinimumTwoSwaps {

    static int minimumSwaps(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == i + 1) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        count++;
                    }
                }

            }
        }
        return count;

    }

    static int minimumSwapsTwo(int[] arr) {
        int min_index = 0;//3
        int min = arr[0];//2
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min_index = i;
                min = arr[i];
            }
        }

        if (min_index != 0) {
            int temp = arr[0];//4
            arr[0] = arr[min_index];//2
            arr[min_index] = temp;
            count++;
        }
        for (int j = 1; j < arr.length - 1; j++) {
            int pos = arr[j] - arr[0];
            while (arr[pos] != arr[j]) {
                int temp = arr[pos];
                arr[pos] = arr[j];
                arr[j] = temp;
                count++;
                pos = arr[j] - arr[0];

            }
            j = pos;

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 2, 5};
        System.out.println(minimumSwapsTwo(arr));
    }
}
