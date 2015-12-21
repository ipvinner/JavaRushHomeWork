package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байты, которые встречаются в файле меньше всего раз.
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            integerArrayList.add(data);
        }

        fileInputStream.close();
        reader.close();

        Map<Integer, Integer> bytesMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < integerArrayList.size(); i++) {
            int currentByte = integerArrayList.get(i);
            int currentByteCount = 1;
            if(!bytesMap.containsKey(currentByte)){
                for (int j = i; j < integerArrayList.size(); j++) {
                    if(currentByte == integerArrayList.get(j)){
                        currentByteCount++;
                    }
                }
                bytesMap.put(currentByte, currentByteCount);
            }

        }


        Iterator<Map.Entry<Integer, Integer>> itr = bytesMap.entrySet().iterator();
        int minBytesCount = itr.next().getValue();
        while (itr.hasNext()){
            Map.Entry<Integer, Integer> pair = itr.next();

            int key = pair.getKey();
            int value = pair.getValue();
            if(value < minBytesCount){
                minBytesCount = value;
            }
        }
        System.out.println(minBytesCount);
        for (Map.Entry<Integer, Integer> entry: bytesMap.entrySet()){
            int currentValue = entry.getValue();
            int currentKey = entry.getKey();
            if(currentValue == minBytesCount){
                System.out.print(currentKey + " ");
            }
        }
    }
}
