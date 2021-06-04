/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task2;

/**
 *
 * @author top
 */
public class Letter {

    public static String isLeter(String s) {

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (!Character.isLetter(c)) {
                return (s + " does not contain only letters");
             
            }
        }

        return (s + " contains only letters");
    }
}
