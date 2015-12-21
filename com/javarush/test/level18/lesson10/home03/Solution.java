package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String resultFile = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();
        reader.close();


        FileOutputStream fileOutputStream = new FileOutputStream(resultFile);
        FileInputStream fileInputStream1 = new FileInputStream(filename2);
        FileInputStream fileInputStream2 = new FileInputStream(filename3);

        while(fileInputStream1.available() > 0){
            int data = fileInputStream1.read();
            fileOutputStream.write(data);
        }
        fileInputStream1.close();

        while (fileInputStream2.available() > 0){
            int data = fileInputStream2.read();

            fileOutputStream.write(data);
        }
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
