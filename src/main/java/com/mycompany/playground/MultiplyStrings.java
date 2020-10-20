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
public class MultiplyStrings {

    public static String multiply(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int result = number1 * number2;
        String answer = String.valueOf(result);

        return answer;
    }

    public static void main(String[] args) {
        String num1="123456789";
        String num2="987654321";
        System.out.println(multiply(num1, num2));
        
    }
}
