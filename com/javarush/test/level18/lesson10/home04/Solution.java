package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileInputStream fileInputStream1 = new FileInputStream(fileName1);
        FileInputStream fileInputStream2 = new FileInputStream(fileName2);

        byte[] bytes1 = new byte[fileInputStream1.available()];
        byte[] bytes2 = new byte[fileInputStream2.available()];


        if(fileInputStream1.available() > 0){
            int data = fileInputStream1.read(bytes1);
        }

        if(fileInputStream2.available() > 0){
            int data = fileInputStream2.read(bytes2);
        }

        FileOutputStream fileOutputStream = new FileOutputStream(fileName1);

        fileOutputStream.write(bytes2);
        fileOutputStream.write(bytes1);

        reader.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
