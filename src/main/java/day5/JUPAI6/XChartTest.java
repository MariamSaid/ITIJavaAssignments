/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.JUPAI6;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import org.knowm.xchart.*;

/**
 *
 * @author top
 */
public class XChartTest {

    public static void main(String[] args) {
        try {
            File file = new File("src\\main\\java\\resources\\titanic_csv.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            List<TitanicPassenger> titanicPassengers = mapper.readValue(file, new TypeReference<List<TitanicPassenger>>() {
            });
            new XChartTest().displayCategoryChart(titanicPassengers);
            new XChartTest().displayPieChart(titanicPassengers);
            new XChartTest().displayBoxChart(titanicPassengers);

        } catch (IOException ex) {
        }
    }

    public void displayCategoryChart(List<TitanicPassenger> titanicPassengers) {
        List<Double> ages = titanicPassengers.stream().map(TitanicPassenger::getAge).limit(5).collect(Collectors.toList());
        List<String> names = titanicPassengers.stream().map(TitanicPassenger::getName).limit(5).collect(Collectors.toList());

        CategoryChart categoryChart = new CategoryChartBuilder().width(1024).height(768).title("Age Histogram").xAxisTitle("Names").yAxisTitle("Age").build();
        categoryChart.addSeries("Passenger's Ages", names, ages);
        new SwingWrapper(categoryChart).displayChart();
    }

    public void displayPieChart(List<TitanicPassenger> titanicPassengers) {

        Map<Integer, Long> classes = titanicPassengers.stream().collect(Collectors.groupingBy(
                TitanicPassenger::getPclass, Collectors.counting()));
        
        PieChart pieChart = new PieChartBuilder().width(800).height(600).title("Classes").build();
        
        pieChart.addSeries("First Class", classes.get(1));
        pieChart.addSeries("Second Class", classes.get(2));
        pieChart.addSeries("Third Class", classes.get(3));
        new SwingWrapper(pieChart).displayChart();

    }

    public void displayBoxChart(List<TitanicPassenger> passengerList) {
    }
}
