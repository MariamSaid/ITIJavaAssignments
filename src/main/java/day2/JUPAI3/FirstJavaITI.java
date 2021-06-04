/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.JUPAI3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author top
 */
public class FirstJavaITI {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "src\\main\\java\\resources\\pyramids.csv";

        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidFromCSV(fileName);
        List<Double> d = new ArrayList<>();
        int i = 0;
        System.out.println("Index  p");
        for (Pyramid p : pyramids) {
//            d.add(p.getHeight());
            System.out.println("#" + (i++) + " " + p);
        }
//        Collections.sort(d);
//        System.out.println(d);
//        System.out.println(d.size());

    }
}
