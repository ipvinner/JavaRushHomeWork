package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть все потоки ввода-вывода
2.2 выбросить исключение DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<String>();

        while(true){
            String filename = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filename);
            int count = fileInputStream.available();
            if(count < 1000){
                reader.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }


    }

    public static class DownloadException extends Exception {


    }
}
