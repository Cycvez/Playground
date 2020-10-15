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
// have to execute faster and not use double for loops
public class NewYearsChaos {

    static void minimumBribes(int[] q) {
        int size = q.length;
        int[] original = new int[size];

        int count = 0;
        for (int i = 0; i < size; i++) {
            original[i] = i + 1;
        }

        for (int i = 0; i < q.length; i++) {
            if (q[i] - original[i] > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < size - 1; j++) {
                if (original[i] == q[j] && i != j) {
                    int stored = q[j];
                    q[j] = q[j + 1];
                    q[j + 1] = stored;

                    count++;
                }
            }
        }
        System.out.println(count);

    }


    public static void main(String[] args) {
        int[] q = {2, 4, 5, 8, 6, 3, 7, 1};
        minimumBribes(q);

    }

}
