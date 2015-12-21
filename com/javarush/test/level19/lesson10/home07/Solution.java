package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
        FileWriter fileWriter = new FileWriter(fileName2);

        String s;
        StringBuilder stringBuilderForWrite = new StringBuilder();
        while((s = fileReader.readLine()) != null){
            String[] spliteStr = s.split(" ");

            for (int i = 0; i < spliteStr.length; i++) {
                if((spliteStr[i].length() > 6)) {
                        stringBuilderForWrite.append(spliteStr[i] + ",");
                }
            }
        }


        fileWriter.write(stringBuilderForWrite.toString().substring(0, stringBuilderForWrite.toString().length() - 1));
        fileReader.close();
        fileWriter.close();
    }
}
