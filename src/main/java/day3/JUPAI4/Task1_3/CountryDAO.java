/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task1_3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author top
 */
public class CountryDAO {

    public List<Country> readCountriesFromCSV(String fileName) {
        File file = new File(fileName);
        List<String> lines;
        List<Country> countries = new ArrayList<>();
        try {
            lines = Files.readAllLines(file.toPath());
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] feature = line.split(",");
                for (int j = 0; j < feature.length; j++) {
                    feature[j] = feature[j].trim();
                }
                countries.add(createCountry(feature));
            }
        } catch (IOException e) {
//           return null ;
            System.out.println(" error happend " + e);
        }

        return countries;
    }

    public Country createCountry(String[] metadata) {
        Country c = new Country(Integer.valueOf(metadata[0]), metadata[1]);
        return c;
    }
}
