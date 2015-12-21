package com.javarush.test.level17.lesson10.home09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Транзакционность
Сделать метод joinData транзакционным, т.е. если произошел сбой, то данные не должны быть изменены.
1. Считать с консоли 2 имени файла
2. Считать построчно данные из файлов. Из первого файла - в allLines, из второго - в forRemoveLines
В методе joinData:
3. Если список allLines содержит все строки из forRemoveLines, то удалить из списка allLines все строки, которые есть в forRemoveLines
4. Если список allLines НЕ содержит каких-либо строк, которые есть в forRemoveLines, то
4.1. очистить allLines от данных
4.2. выбросить исключение CorruptedDataException
Сигнатуру метода main не менять.  Метод joinData должен вызываться в main.
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename1;
        String filename2;

        try {
             filename1 = reader.readLine();
             filename2 = reader.readLine();

             Scanner scanner1 = new Scanner(new File(filename1));
             while (scanner1.hasNext()){
                 allLines.add(scanner1.nextLine());
             }

             Scanner scanner2 = new Scanner(new File(filename2));
             while (scanner2.hasNext()){
                 forRemoveLines.add(scanner2.nextLine());
             }
             scanner1.close();
             scanner2.close();

             new Solution().joinData();

        }catch (CorruptedDataException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {

        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
            return;
        }

        for (String s : forRemoveLines) {
            if (!allLines.contains(s)){
                allLines.clear();
                throw  new CorruptedDataException();
            }
        }



    }



}
