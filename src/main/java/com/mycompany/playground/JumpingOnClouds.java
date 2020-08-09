/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class JumpingOnClouds {

    public static void main(String[] args) {
        
        

    }

    public static int cloudJumping(int[] cumOrThun) {
        int numJumps = 0;
        int currentCloud = 0;

        while (currentCloud < cumOrThun.length - 1) {
            if (currentCloud + 2 == cumOrThun.length || cumOrThun[currentCloud + 2] == 1) {
                currentCloud++;
                numJumps++;
            } else {
                currentCloud += 2;
                numJumps++;
            }
        }

        return numJumps;
    }
}
