package com.javarush.test.level09.lesson11.home04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код

        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        Date date = new Date(reader.readLine());
        SimpleDateFormat datFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);

        datFormat.format(date);
        String month = date.toString().toUpperCase().split(" ")[1];
        String day = date.toString().split(" ")[2];
        String year = date.toString().split(" ")[5];

        System.out.println(month + " " + day + ", " + year);


    }
}
