package com.javarush.test.level19.lesson05.task02;

/* Считаем слово
Считать с консоли имя файла.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть поток ввода.
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader bf = new BufferedReader(new FileReader(fileName));

        Pattern p = Pattern.compile("\\bworld\\b", Pattern.CASE_INSENSITIVE);

        int worldCount = 0;
        String line;

        while ( (line = bf.readLine()) != null) {

            Matcher m = p.matcher(line);

            while (m.find()) {
               worldCount++;
            }
        }

        System.out.println(worldCount);


        bf.close();
        reader.close();
    }
}
