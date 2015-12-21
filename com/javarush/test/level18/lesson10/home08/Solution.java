package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String exitStr = "exit";
        while(true){
            String currentFilename = reader.readLine();
            if (currentFilename.equals(exitStr)) {
                break;
            }else{
                new ReadThread(currentFilename).start();
            }
        }



        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }

        public void run(){
            try {
                FileInputStream fileInputStream = new FileInputStream(fileName);

                Map<Integer, Integer> integerLinkedHashMap = new LinkedHashMap<Integer, Integer>();

                while(fileInputStream .available()>0){
                    int data = fileInputStream.read();
                    if (!integerLinkedHashMap.containsKey(data)){
                        integerLinkedHashMap.put(data, 1);
                    }else {
                        integerLinkedHashMap.put(data,integerLinkedHashMap.get(data)+1);
                    }
                    int maxFreq=0;

                    for (int c : integerLinkedHashMap.keySet()){
                        maxFreq = max(maxFreq, integerLinkedHashMap.get(c));
                    }
                    for (int c : integerLinkedHashMap.keySet()){
                        if(integerLinkedHashMap.get(c) == maxFreq){
                            resultMap.put(fileName,(int)c);
                        }
                    }
                }

                fileInputStream.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        synchronized private int max(int a, int b) {
            return (a >= b) ? a : b;
        }


        // implement file reading here - реализуйте чтение из файла тут
    }
}
