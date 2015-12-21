package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        HashSet<Integer> integerHashSet = new HashSet<Integer>();

        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            integerHashSet.add(data);
        }

        List sortedList = new ArrayList(integerHashSet);

        Collections.sort(sortedList);

        for (int i = 0; i < sortedList.size(); i++) {
            System.out.println(sortedList.get(i));
        }
        fileInputStream.close();
        reader.close();
    }
}
