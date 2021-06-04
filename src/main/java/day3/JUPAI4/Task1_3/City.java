/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3.JUPAI4.Task1_3;

/**
 *
 * @author top
 */
public class City {

    private int code;
    private String name;
    private String continent;
    private double SurfaceArea;
    private int population;
    private String country;
    private int capital;

    public City(int code, String name, String continent, double SurfaceArea, int population, String country, int capital) {
        this.code = code;
        this.name = name;
        this.continent = continent;
        this.SurfaceArea = SurfaceArea;
        this.population = population;
        this.country = country;
        this.capital = capital;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(double SurfaceArea) {
        this.SurfaceArea = SurfaceArea;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "City{" + "code=" + code + 
                ", name=" + name + ", continent=" + continent +
                ", SurfaceArea=" + SurfaceArea + ", population=" + population +
                ", country=" + country + ", capital=" + capital + '}';
    }

}
