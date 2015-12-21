package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            integerArrayList.add(data);
        }

        fileInputStream.close();

        int minByte = integerArrayList.get(0);

        for (int i = 0; i < integerArrayList.size(); i++) {
            int currentByte = integerArrayList.get(i);
            if(currentByte < minByte){
                minByte = currentByte;
            }
        }

        System.out.println(minByte);
    }
}
