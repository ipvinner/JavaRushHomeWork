package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        int byteCount = 1;
        while(fileReader.ready()){
            int data = fileReader.read();
            System.out.println(data);
            if(byteCount % 2 == 0) fileWriter.write(data);
            byteCount++;
        }

        reader.close();
        fileWriter.close();
        fileReader.close();
    }
}
