package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
        FileWriter fileWriter = new FileWriter(fileName2);

        String s;

        while((s = fileReader.readLine()) != null){
           String[] splitStr = s.split(" ");
            for (int i = 0; i < splitStr.length; i++) {
                if (splitStr[i].matches("^-?\\d+$")){
                    if(i != splitStr.length - 1){
                        fileWriter.write(splitStr[i] + " ");
                    }else{
                        fileWriter.write(splitStr[i]);
                    }
                }
            }
        }

        fileReader.close();
        fileWriter.close();
        reader.close();

    }
}
