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
public class CityDAO {

    public List<City> readCitiesFromCSV(String fileName) throws IOException {
        File file = new File(fileName);
        List<String> lines;
        List<City> cities = new ArrayList<>();
        try {
            lines = Files.readAllLines(file.toPath());
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i);
                String[] feature = line.split(",");
                for (int j = 0; j < feature.length; j++) {
                    feature[j] = feature[j].trim();
                }
                cities.add(createCity(feature));
            }
        } catch (IOException e) {
//           return null ;
            System.out.println(" error happend " + e);
        }

        return cities;
    }

    public City createCity(String[] metadata) {
        City c = new City(Integer.valueOf(metadata[0]), metadata[1],
                metadata[2], Double.valueOf(metadata[3]),
                Integer.valueOf(metadata[4]),
                metadata[5], Integer.valueOf(metadata[6]));
        return c;
    }
}
