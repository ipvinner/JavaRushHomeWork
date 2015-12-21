package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть закрыть файл и поток.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String filename = reader.readLine();
//        InputStream inputStream = new FileInputStream(filename);
        InputStream inputStream = new FileInputStream (reader.readLine());
        while(inputStream.available() > 0){
//            int data = inputStream.read();
            System.out.print((char) inputStream.read());
        }
        reader.close();
        inputStream.close();
    }
}
