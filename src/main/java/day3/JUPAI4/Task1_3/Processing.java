/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task1_3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author top
 */
public class Processing {

    private List<City> findSesificCountry(String countryName, List<City> list) {

        List<City> result = new ArrayList<>();
        list.stream().filter((city) -> (city.getCountry()
                .equals(countryName))).forEachOrdered((city) -> {
            result.add(city);
        });
        return result;
    }
    /////each country with thier cities

    public void mappingCountry(List<Country> countries, List<City> cities) {
        List<City> l = new ArrayList<>();
        Map< Integer, List<City>> map = new HashMap<>();
        countries.forEach((c) -> {
            map.put(c.getCountryCode(), findSesificCountry(c.getCountryName(), cities));
        });
        System.out.println("Coutry City Map: " + map);

    }

    ///for specific country print its cities accourding population
    public void mappingAccordToPopulation(List<Country> countries, List<City> cities) {
        List<City> ll = findSesificCountry("Egypt", cities);
        List<City> sortedList = ll.stream().sorted(Comparator.comparingInt(City::getPopulation))
                .collect(Collectors.toList());
        int i = 0;
        for (City p : sortedList) {
            System.out.println("#" + (i++) + p);
        }

    }

    ///////print country with max population
    public void getMaxcountry(List<Country> countries, List<City> cities) {
        List<City> maxcity = new ArrayList<>();
        countries.stream().map((c) -> cities.stream()
                .filter(x -> x.getCountry().equals(c.getCountryName()))
                .mapToInt(x -> x.getPopulation())
                .max().getAsInt()).forEachOrdered((maxOfC) -> {
            cities.stream()
                    .filter(x -> x.getPopulation() == maxOfC)
                    .forEach(x -> maxcity.add(x));
        });
        maxcity.forEach((city) -> {
            System.out.println("country : " + city.getCountry() + " the highest population city: " + city.getName());
        });
    }
    //////print continent

    public void getMaxContinent(List<Country> countries, List<City> cities) {
        List<String> continentList = cities.stream()
                .map(obj -> obj.getContinent())
                .distinct().collect(Collectors.toList());

        List<City> maxcityOFcontinent = new ArrayList<>();
        continentList.stream().map((c) -> cities.stream()
                .filter(x -> x.getContinent().equals(c))
                .mapToInt(x -> x.getPopulation())
                .max().getAsInt()).forEachOrdered((maxOfC) -> {
            cities.stream()
                    .filter(x -> x.getPopulation() == maxOfC)
                    .forEach(x -> maxcityOFcontinent.add(x));
        });
        maxcityOFcontinent.forEach((city) -> {
            System.out.println(" the continent: " + city.getContinent() + " the  highest population city: " + city.getName());
        });
    }
    ////////print capital

    public void getMaxCapital(List<Country> countries, List<City> cities) {
        int maxOfCapitals = cities.stream()
                .filter(x -> x.getCapital() == 1)
                .mapToInt(x -> x.getPopulation())
                .max().getAsInt();
        cities.stream()
                .filter(x -> x.getPopulation() == maxOfCapitals)
                .forEach(x -> System.out.println(" The Highest population capital: " + x.getName()));

    }
}
