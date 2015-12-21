package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        int id = Integer.parseInt(args[0]);

        FileInputStream fileInputStream = new FileInputStream(filename);

        byte[] bytes = new byte[fileInputStream.available()];

        if(fileInputStream.available() > 0 ){
            int data = fileInputStream.read(bytes);
        }

        String s = new String(bytes);
        String[] goods = s.split(System.getProperty("line.separator"));
        for (int i = 0; i < goods.length; i++) {
            if(goods[i].startsWith(String.valueOf(id))) System.out.println(goods[i]);
        }

        fileInputStream.close();
        reader.close();

    }
}
