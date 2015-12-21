package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
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

        int maxBytesCount = 0;
        Iterator<Map.Entry<Integer, Integer>> itr = bytesMap.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<Integer, Integer> pair = itr.next();
            int key = pair.getKey();
            int value =pair.getValue();
            if(value > maxBytesCount){
                maxBytesCount = value;
            }

        }

        for (Map.Entry<Integer, Integer> entry: bytesMap.entrySet()){
            int currentValue = entry.getValue();
            int currentKey = entry.getKey();
            if(currentValue == maxBytesCount){
                System.out.print(currentKey + " ");
            }
        }

    }
}
