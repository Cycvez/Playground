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
public class LongPelindrome {

    public static boolean longestPalindrome(String s) {
        String[] charArray = s.split("");
        int i = 0;
        int j = charArray.length-1;
        boolean palindrome=false;

        while (i < j) {
            if (charArray[i] == charArray[j]) {
                i++;
                j--;
                palindrome=true;
            }
        }
        return palindrome;
    }

    public static void main(String[] args) {
        String s = "babad";

        System.out.println(longestPalindrome(s));

    }
}
