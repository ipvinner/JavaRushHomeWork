package com.javarush.test.level06.lesson08.task05;

/* Класс StringHelper
Cделать класс StringHelper, у которого будут 2 статических метода:
String multiply(String s, int count) – возвращает строку повторенную count раз.
String multiply(String s) – возвращает строку повторенную 5 раз.
Пример:
Амиго -> АмигоАмигоАмигоАмигоАмиго
*/

public class StringHelper
{
    public static String multiply(String s)
    {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result += s;
        }
        //Напишите тут ваш код
        return result;
    }

    public static String multiply(String s, int count)
    {
        int stringCount = 0;
        String result = "";
        while(stringCount < count){
            result += s;
            stringCount++;
        }
        //Напишите тут ваш код
        return result;
    }
}
