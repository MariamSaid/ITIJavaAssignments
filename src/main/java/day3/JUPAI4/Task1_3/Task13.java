/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task1_3;

import java.io.IOException;
import java.util.List;

/**
 *
 * @author top
 */
public class Task13 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        //task1 read from csv
        CityDAO cDAO = new CityDAO();
        List<City> cities = cDAO.readCitiesFromCSV("src\\main\\java\\resources\\city.csv");

        CountryDAO countryDAO = new CountryDAO();
        List<Country> countries = countryDAO.readCountriesFromCSV("src\\main\\java\\resources\\country.csv");

        Processing pro = new Processing();
        //each country with thier cities
        pro.mappingCountry(countries, cities);

        //for specific country print its cities accourding population 
        pro.mappingAccordToPopulation(countries, cities);

        //print country with max population
        pro.getMaxcountry(countries, cities);

        //print continent
        pro.getMaxContinent(countries, cities);

        //print capital 
        pro.getMaxCapital(countries, cities);
    }

}
