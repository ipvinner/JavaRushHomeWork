package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = reader.readLine();
        String filename2 = reader.readLine();
        String filename3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(filename1);
        FileOutputStream fileOutputStream1 = new FileOutputStream(filename2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(filename3);

        byte[] buffer1;
        byte[] buffer2;
        if(fileInputStream.available() % 2 == 0){
             buffer1 = new byte[fileInputStream.available()/2];
             buffer2 = new byte[fileInputStream.available()/2];
        }else{
             buffer1 = new byte[fileInputStream.available()/2 + 1];
             buffer2 = new byte[fileInputStream.available()/2];
        }

        if(fileInputStream.available() > 0){
            int count1 = fileInputStream.read(buffer1);
            fileOutputStream1.write(buffer1);
            int count2 = fileInputStream.read(buffer2);
            fileOutputStream2.write(buffer2);
        }

        reader.close();
        fileInputStream.close();
        fileOutputStream1.close();
        fileOutputStream2.close();
    }
}
