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
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s = MyString.betterString("Mariam", "MamaZOZO", MyString::isbigger);
        System.out.println("The better String is " + s);
        
        s = MyString.betterString("Mariam", "Mama", MyString::isbigger);
        System.out.println("The better String is " + s);
        
        System.out.println(Letter.isLeter("Mariam123"));
        System.out.println(Letter.isLeter("Mariam"));

    }

}
