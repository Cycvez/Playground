/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.playground;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author carlo
 */
public class LongPressed {

    public static void main(String[] args) {
        String name = "alex";
        String typed = "aaleex";

        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        boolean longPressed=false;

       
        List<Character> chars = new ArrayList<>();
        
        for (char ch : name.toCharArray()) {
            chars.add(ch);
        }
        for (char c : typed.toCharArray()) {
            if (!chars.isEmpty()&&chars.contains(c)) {
                chars.remove(c);
            }
        }
        if (chars.isEmpty()) {
            longPressed = true;
        }

        return longPressed;
    }
}
