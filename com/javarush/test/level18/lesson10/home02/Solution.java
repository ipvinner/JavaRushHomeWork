package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];

        FileInputStream fileInputStream = new FileInputStream(filename);
        int spacesCount = 0;
        int allCharacters = 0;

        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(data > 0){
                allCharacters++;
            }

            if(data == 32){
                spacesCount++;
            }
        }

        double spacesFrequencyCount = ((double)spacesCount/allCharacters) * 100;
        double newDouble = new BigDecimal(spacesFrequencyCount).setScale(2, RoundingMode.HALF_UP).doubleValue();
        System.out.println(newDouble);

        fileInputStream.close();


    }
}
