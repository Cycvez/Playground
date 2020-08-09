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
public class RepeatedString {

    public static long repeatedString(String s, long n) {
        long count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                count++;
            }
        }

        long amountOfReps = (n / s.length());
        long remainder = (n % s.length());
        count = amountOfReps * count;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
//        String[] letters = s.split("");
//        long amountOfReps = n / s.length();
//        int remainder = (int) (n % s.length());
//        long found = 0;
//
//        for (char ch : s.toCharArray()) {
//            if (ch == 'a');
//            found++;
//        }
//
//        long total = found * amountOfReps;
//        if (remainder == 0) 
//            return total;
//       else {
//            String letter = s.substring(0, remainder);
//            for (char ch : letter.toCharArray()) {
//                if (ch == 'a') 
//                    total++;
//                
//            }
//        }
//        return total;
    }
//    public static long repeatedString(String s, long n) {
//
//        String[] letters = s.split("");
//        List<String> newString = new ArrayList<>();
//        int newN = (int) n;
//        int amountOfReps = newN / letters.length;
//        int remainder = newN % letters.length;
//
//        for (int i = 0; i < amountOfReps; i++) {
//            for (int j = 0; j < letters.length; j++) {
//                newString.add(letters[j]);
//            }
//        }
//        for(int k = 0; k<=remainder; k++){
//            newString.add(letters[k]);
//        }
//        
//        long amountOfRepeats= Collections.frequency(newString, "a");
//        
//        return amountOfRepeats;
//    
//    }

    public static void main(String[] args) {
        String s = "aba";
        long n = 10;

        System.out.println(repeatedString(s, n));

    }

}
