package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream ouputStream = new FileOutputStream(reader.readLine());
        String exit = "test";
        while(!exit.equals("exit")){
            //System.out.println("new Line");
            String currentLine = reader.readLine();
                ouputStream.write((currentLine + "\n").getBytes());
                exit = currentLine;

        }

        ouputStream.close();
        reader.close();


    }
}
