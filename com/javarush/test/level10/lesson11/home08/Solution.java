package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //Напишите тут ваш код
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(0, "Vania");
        arr1.add(1, "Vasya");
        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add(0, "IT");
        arr2.add(1, "retail");
        arr2.add(2, "show-biz");
        ArrayList<String> arr3 = new ArrayList<String>();
        arr3.add(0, "ONAS");
        arr3.add(1, "OGAZ");
        arr3.add(2, "ORGAZM");

        ArrayList<String>[] strArray = new ArrayList[3];

            strArray[0] = arr1;
            strArray[1] = arr2;
            strArray[2] = arr3;

        return strArray;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}