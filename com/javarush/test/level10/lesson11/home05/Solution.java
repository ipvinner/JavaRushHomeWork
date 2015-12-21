package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet = new ArrayList<Character>();
        for(int i=0;i<32;i++)
        {
            alphabet.add( (char) ('а'+i));
        }
        alphabet.add(6,'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++)
        {
            String s = reader.readLine();
            list.add( s.toLowerCase());
        }

        for (int i = 0; i < alphabet.size(); i++) {
            char ch = alphabet.get(i);
            System.out.println(ch + " " + getCount(list, ch));
        }
        //Напишите тут ваш код
    }

    public static int getCount(ArrayList<String> list, char char1){
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            char[] chars = s.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if(chars[j] == char1){
                    count++;
                }
            }
        }

        return count;
    }

}
