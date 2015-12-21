package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add(0, "error month, please enter correct month name");
        arrayList.add(1, "January");
        arrayList.add(2, "February");
        arrayList.add(3, "March");
        arrayList.add(4, "April");
        arrayList.add(5, "May");
        arrayList.add(6, "June");
        arrayList.add(7, "July");
        arrayList.add(8, "August");
        arrayList.add(9, "September");
        arrayList.add(10, "October");
        arrayList.add(11, "November");
        arrayList.add(12, "December");

        for (int i = 0; i < arrayList.size(); i++) {
                String s = arrayList.get(i);
            if(month.equals(s)){
                System.out.println(s + " is " + i + " month");
            }
        }
    }

}
