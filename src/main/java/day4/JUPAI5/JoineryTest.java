/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4.JUPAI5;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import joinery.DataFrame;

/**
 *
 * @author top
 */
public class JoineryTest {

    public static void main(String[] args) throws IOException {
        //add columns, merge and join with Joinery lib

        //Load titanic dataset 
        DataFrame<Object> df = DataFrame.readCsv("src\\main\\java\\resources\\titanic.csv");

        //printitng some statistics about the data
        System.out.println(df.describe());
        //printing first 10 rows from our data
        System.out.println(df.head());

        //create two sub dataframes 
        DataFrame df1 = df.retain("pclass", "body", "name", "survived");
        System.out.println(df1.describe());

        DataFrame df2 = df.retain("age", "parch", "name", "survived");
        System.out.println(df2.describe());

        // create a list of nums between 1 and df size and convert it to string to merge our dataframes
        List<String> colList = IntStream.rangeClosed(1, df1.length())
                .boxed().collect(Collectors.toList()).stream()
                .map(s -> String.valueOf(s))
                .collect(Collectors.toList());

        //adding the new column to both dataframes 
        df1.add("new string col", colList);
        df2.add("new string col", colList);

        System.out.println(df1.head());
        System.out.println(df2.head());

        //joining and merging the two dataframes and print the output dataframe
        System.out.println(df1.joinOn(df2, DataFrame.JoinType.INNER, "new string col").head());
        System.out.println(df1.merge(df2).head());
    }

}
