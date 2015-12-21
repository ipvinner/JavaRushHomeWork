package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<int[]>();
        int[] intArr1 = {2, 3, 4, 0, -2};
        int[] intArr2 = {6, 8};
        int[] intArr3 = {0, -57, 1, 59,};
        int[] intArr4 = {58, 5, 8, 0, -7, -6, 0};
        int[] intArr5 = {};

        arrayList.add(0, intArr1);
        arrayList.add(1, intArr2);
        arrayList.add(2, intArr3);
        arrayList.add(3, intArr4);
        arrayList.add(4, intArr5);

        return arrayList;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
