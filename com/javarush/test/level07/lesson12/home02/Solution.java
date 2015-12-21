package com.javarush.test.level07.lesson12.home02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Переставить M первых строк в конец списка
Ввести с клавиатуры 2 числа N  и M.
Ввести N строк и заполнить ими список.
Переставить M первых строк в конец списка.
Вывести список на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());
        
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            intList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < m; i++) {
            int temp = intList.get(0);
            intList.remove(0);
            intList.add(temp);
        }

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        //Напишите тут ваш код
    }
}
