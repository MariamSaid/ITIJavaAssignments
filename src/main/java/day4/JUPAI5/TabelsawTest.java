/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.JUPAI5;

import java.io.IOException;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.Table;

/**
 *
 * @author top
 */
public class TabelsawTest {

    public static void main(String[] args) throws IOException {
        //add columns, merge and join with TableSaw lib

        //Load titanic dataset 
        Table t = Table.read().csv("src\\main\\java\\resources\\titanic.csv");
        
        //printitng some statistics about the data
        System.out.println(t.summary());
        //printing some info about the columns of the data
        System.out.println(t.structure());

        //create two sub tables 
        Table t1 = t.select("pclass", "body");
        Table t2 = t.select("age", "survived");

        //print some info about our tabels
        System.out.println(t1.summary());
        System.out.println(t2.summary());

        //creating a new int cloumn with 0's 
        ////List<Integer> colList = new ArrayList<>(Collections.nCopies(df.length(), 1));
        IntColumn column = IntColumn.create("new", new int[t.rowCount()]);

        //adding the new column to both tabels 
        t2.addColumns(column);
        t1.addColumns(column);

        //print the tabels with the new column
        System.out.println(t1.summary());
        System.out.println(t2.summary());

        //joining and merging the two tabels and print the output dataframe
        Table joinOnT = t1.joinOn("new").inner(t2);
        System.out.println(joinOnT.summary());
    }
}