/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5.JUPAI6;

/**
 *
 * @author top
 */
public class TitanicPassenger {

    private int pclass;
    private int survived;
    private String name;
    private String sex;
    private double age;
    private double sibsp;
    private double parch;
    private String ticket;
    private double fare;
    private String cabin;
    private String embarked;
    private String boat;
    private String body;
    private String homeDist;

    public TitanicPassenger() {
    }

    public TitanicPassenger(int pclass, int survived, String name, String sex, double age, double sibsp, double parch, String ticket, double fare, String cabin, String embarked, String boat, String body, String homeDist) {
        this.pclass = pclass;
        this.survived = survived;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibsp = sibsp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
        this.boat = boat;
        this.body = body;
        this.homeDist = homeDist;
    }

    public int getPclass() {
        return pclass;
    }

    public void setPclass(int pclass) {
        this.pclass = pclass;
    }

    public int getSurvived() {
        return survived;
    }

    public void setSurvived(int survived) {
        this.survived = survived;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getSibsp() {
        return sibsp;
    }

    public void setSibsp(double sibsp) {
        this.sibsp = sibsp;
    }

    public double getParch() {
        return parch;
    }

    public void setParch(double parch) {
        this.parch = parch;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getEmbarked() {
        return embarked;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    public String getBoat() {
        return boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHomeDist() {
        return homeDist;
    }

    public void setHomeDist(String homeDist) {
        this.homeDist = homeDist;
    }

    @Override
    public String toString() {
        return "TitanicPassenger{" + "pclass=" + pclass + ", survived=" + survived + ", name=" + name + ", sex=" + sex + ", age=" + age + ", sibsp=" + sibsp + ", parch=" + parch + ", ticket=" + ticket + ", fare=" + fare + ", cabin=" + cabin + ", embarked=" + embarked + ", boat=" + boat + ", body=" + body + ", homeDist=" + homeDist + '}';
    }
    

}
