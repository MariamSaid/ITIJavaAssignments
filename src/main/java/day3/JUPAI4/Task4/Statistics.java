/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task4;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author top
 */
public class Statistics {

    double calcMedian(List<Double> heights) {
        double median;
        
        int size = heights.size();
        if (heights.size() % 2 == 0) {
            median = (heights.get(size / 2) + heights.get((size / 2) - 1)) / 2;
        } else {
            median = heights.get(size / 2);
        }
        
        return median;

    }

    double calcFirstQuartile(List<Double> heights) {
        return calcQuartile(heights);
    }

    double calcthirdQuartile(List<Double> heights) {
        Collections.reverse(heights);
        return calcQuartile(heights);
    }

    double calcQuartile(List<Double> heights) {
        double quartile;
        int size = heights.size();
        //size % 4 == 0 || size % 4 == 1 like numbers 12 and 9
        if (size % 4 == 0 || size % 4 == 1) { 
            quartile = (heights.get(size / 4) + heights.get((size / 4) - 1)) / 2;
        // size % 4 == 2 || size % 4 == 3 like nums 10 11 
        } else {
            quartile = heights.get(size / 4 - 1);
        }
        return quartile;
    }

}
