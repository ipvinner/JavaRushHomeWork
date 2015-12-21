package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String, String> treeMap = new TreeMap<>();


        while(true){
            String currentFileName = reader.readLine();
            if (currentFileName.equals("end")) break;
            String[] parse = currentFileName.split("\\.");
            treeMap.put(parse[parse.length - 1], currentFileName);

        }

        String commonFileName = "";

        if(treeMap.get("part1") != null){
            String firstFilePart = treeMap.get("part1");
            commonFileName = firstFilePart.substring(0, firstFilePart.length() - 6);
        }else{
            System.out.println("Please add parts of File");
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = new FileOutputStream(commonFileName);

        for (Map.Entry<String, String> pair : treeMap.entrySet()) {
            String value = pair.getValue();
            fileInputStream = new FileInputStream(value);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer, 0, fileInputStream.available());
            fileOutputStream.write(buffer);
        }

        fileInputStream.close();
        fileOutputStream.close();
        reader.close();

    }
}
