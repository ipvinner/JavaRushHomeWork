package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);
        String s = "";
        while(fileReader.ready()){
            int data = fileReader.read();
            s += (char) data;
        }
        String replaceStr = s.replaceAll("\\.", "!");

        fileWriter.write(replaceStr.toCharArray());

        fileWriter.close();
        fileReader.close();
        reader.close();

    }
}
