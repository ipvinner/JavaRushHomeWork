package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
        FileWriter fileWriter = new FileWriter(fileName2);

        String s;

        while((s = fileReader.readLine()) != null){
            String[] splitedStr = s.split(" ");
            for (int i = 0; i < splitedStr.length; i++) {
                char[] charArray = splitedStr[i].toCharArray();
                for (int j = 0; j < charArray.length; j++) {
                    if((int)charArray[j] >= 48 && (int) charArray[j] < 58 ){
                        fileWriter.write(charArray);
                        fileWriter.write(32);
                        break;
                    }
                }
            }
        }
        fileWriter.close();
        fileReader.close();
    }

}
