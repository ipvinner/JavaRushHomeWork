package com.javarush.test.level22.lesson13.task02;

import java.io.*;


/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        FileInputStream fileInputStream = new FileInputStream(fileName1);
        byte[] buffer = new byte[fileInputStream.available()];
        fileInputStream.read(buffer);
        fileInputStream.close();

        String s = new String(buffer,"UTF-8");

        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        fileOutputStream.write(s.getBytes("windows-1251"));
        fileOutputStream.close();

    }
}
