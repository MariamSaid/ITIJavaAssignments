/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task2;

import java.util.function.BiPredicate;

/**
 *
 * @author top
 */
public class MyString {
      public static boolean isbigger(int n1, int n2) {
        return n1 > n2;
    }

    public static String betterString(String s1, String s2, BiPredicate<Integer, Integer> p) {
        if (p.test(s1.length(), s2.length())) {
            return s1;
        }
        return s2;
    }
    
}
