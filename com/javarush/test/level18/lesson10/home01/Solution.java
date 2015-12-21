package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        FileInputStream fileInputStream = new FileInputStream(filename);
        int englishLattersCount = 0;

        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if((data > 64 && data < 91) || (data > 96 && data < 123)){
                englishLattersCount++;
            }
        }

        System.out.println(englishLattersCount);
    }
}
