package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();


        FileInputStream fileInputStream = new FileInputStream(fileName1);
        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        String linesFromFirstFile = "";
        while (true){
            String currentLine = fileReader.readLine();
            if(currentLine == null) break;
            linesFromFirstFile += currentLine;
        }

        String[] numbersStrArray = linesFromFirstFile.split(" ");
        String[] roundNumbersStrArray = new String[numbersStrArray.length];
        for (int i = 0; i < numbersStrArray.length; i++) {
            roundNumbersStrArray[i] = Long.toString(Math.round(Double.parseDouble(numbersStrArray[i])));
        }

        for (int i = 0; i < roundNumbersStrArray.length; i++) {
            if(i < roundNumbersStrArray.length - 1){
                fileOutputStream.write((roundNumbersStrArray[i] + " ").getBytes());}
            else{
                fileOutputStream.write((roundNumbersStrArray[i]).getBytes());
            }
        }



        reader.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
