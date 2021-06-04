/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task4;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author top
 */
public class Mytask4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Pyramid> pyramids = new PyramidCSVDAO().readPyramidsFromCSV("src\\main\\java\\resources\\pyramids.csv");
       //filter data which conatin hight is missing 
        List<Double> heights = pyramids.stream()
                .filter(x -> x.getHeight() != 0)
                .map(x -> x.getHeight())
                .collect(Collectors.toList());

        Collections.sort(heights);
        Statistics s = new Statistics();

//        System.out.println(heights);
        System.out.println("Median = " + s.calcMedian(heights));
        System.out.println("First Quartile = " + s.calcFirstQuartile(heights));
        System.out.println("Third Quartile = " + s.calcthirdQuartile(heights));
    }

}
