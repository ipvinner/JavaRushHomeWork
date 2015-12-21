package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//        InputStream inputStream = new FileInputStream("C:/Users/vinner/Desktop/TEMP/tesxt.txt");
//
//        while (inputStream.available() > 0){
//            integerArrayList.add(inputStream.read());
//        }
//        inputStream.close();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file = new File(reader.readLine());

        //BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("C:/Users/vinner/Desktop/TEMP/tesxt.txt"))));
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;

        while ((line = br.readLine()) != null) {
            if(Integer.parseInt(line) % 2 == 0) {
                integerArrayList.add(Integer.parseInt(line));
            }
            //System.out.println(line);
        }

        for (int i = 0; i < integerArrayList.size(); i++) {

                for (int barrier = i + 1; barrier < integerArrayList.size(); barrier++) {
                    if(integerArrayList.get(barrier) < integerArrayList.get(i) ){
                        int temp = integerArrayList.get(i);
                        integerArrayList.set(i, integerArrayList.get(barrier));
                        integerArrayList.set(barrier, temp);
                    }
                }
                System.out.println(integerArrayList.get(i));

        }

//        for (int i = 0; i < integerArrayList.size(); i++) {
//            if(integerArrayList.get(i) % 2 == 0){
//                System.out.println(integerArrayList.get(i));
//            }
//        }
        // напишите тут ваш код
    }
}
