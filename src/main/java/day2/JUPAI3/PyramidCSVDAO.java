/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2.JUPAI3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author top
 */
public class PyramidCSVDAO {

    public List<Pyramid> readPyramidFromCSV(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        List<String> lines;
        List<Pyramid> pyramids = new ArrayList<>();

        try {
            lines = Files.readAllLines(file.toPath());
            for (int i = 1; i < lines.size(); i++) {
                String line;
                line = lines.get(i);
                String[] feature = line.split(",");
                for (int j = 0; j < feature.length; j++) {
                    feature[j] = feature[j].trim();
                }
                pyramids.add(createPyramid(feature));
            }
        } catch (IOException e) {

            return null;
        }
        return pyramids;
    }

    public Pyramid createPyramid(String[] metadata) {
        double height;
        if (metadata[7].isEmpty()) {
            height = 0;

        } else {
            height = Double.parseDouble(metadata[7]);
        }
        Pyramid p = new Pyramid(metadata[0], metadata[2], metadata[4], height);
        return p;
    }
}
