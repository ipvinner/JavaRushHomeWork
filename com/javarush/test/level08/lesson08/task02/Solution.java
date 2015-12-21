package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(11);
        hs.add(12);
        hs.add(5);
        hs.add(43);
        hs.add(55);
        hs.add(3);
        hs.add(0);
        hs.add(2);
        hs.add(6);
        hs.add(8);
        hs.add(9);
        hs.add(122);
        hs.add(50);
        hs.add(47);
        hs.add(4);
        hs.add(70);
        hs.add(60);
        hs.add(40);

        return hs;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer number = iterator.next();
            if(number > 10){
                iterator.remove();
            }
        }

        return set;

    }
}
