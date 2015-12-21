package com.javarush.test.level07.lesson06.task05;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        ArrayList<String> strList = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strList.add(reader.readLine());
        }

        ///System.out.println(strList.size());

       for (int i = 0; i < 13; i++) {
            String lastString = strList.get(strList.size() - 1);
            strList.remove(strList.size() - 1);
            strList.add(0, lastString);
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

    }
}
