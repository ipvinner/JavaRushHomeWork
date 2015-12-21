package com.javarush.test.level07.lesson12.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* Вводить с клавиатуры строки, пока пользователь не введёт строку 'end'
Создать список строк.
Ввести строки с клавиатуры и добавить их в список.
Вводить с клавиатуры строки, пока пользователь не введёт строку "end".  "end" не учитывать.
Вывести строки на экран, каждую с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strList = new ArrayList<String>();
        String endString = "end";

        while(true){
            String s = reader.readLine();
            if(s.equals(endString)){
                break;
            }else {
                strList.add(s);
            }
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        //Напишите тут ваш код
    }
}
