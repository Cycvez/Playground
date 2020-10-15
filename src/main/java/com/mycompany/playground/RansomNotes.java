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
public class RansomNotes {

    public static void main(String[] args) {
        int x = -2147483648;

        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        String num = String.valueOf(x);
        String[] numArr = num.split("");
        String sb ="";

        
        int max = numArr.length;


        for (int i = max - 1; i >= 0; i--) {
            
            sb=sb+numArr[i];

        }
        if(sb.endsWith("-")){
           String newSB=sb.substring(0, max-1);
           String addNeg="-"+newSB;
           Long newLong=Long.parseLong(addNeg);
           int answer= newLong.intValue();
           return answer;
        }
        
        
        int reverseNum= Integer.parseInt(sb);
        
        return reverseNum;
    }
}
