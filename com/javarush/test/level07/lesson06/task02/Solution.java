package com.javarush.test.level07.lesson06.task02;

/* 5 строчек: «101», «102», «103», «104», «105»
1. Создай список строк.
2. Добавь в него 5 строчек: «101», «102», «103», «104», «105».
3. Удали первую, среднюю и последнюю.
4. Используя цикл выведи на экран его содержимое, каждое значение с новой строки.
5. Выведи его размер. (После удаления одного элемента индексы остальных меняются.
Например, если удалить 0-й элемент, то тот, который был 1-м, станет 0-м. И т.д.)
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> strList = new ArrayList<String>();

        strList.add("101");
        strList.add("102");
        strList.add("103");
        strList.add("104");
        strList.add("105");

        strList.remove(0);
        strList.remove(1);
        strList.remove(2);

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        System.out.println(strList.size());

    }
}
