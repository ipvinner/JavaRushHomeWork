package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
       HashSet<String> hs = new HashSet<String>();
        hs.add("Любовь");
        hs.add("Лида");
        hs.add("Ласточка");
        hs.add("Ладья");
        hs.add("Ладан");
        hs.add("Лепесток");
        hs.add("Лампа");
        hs.add("Лицемер");
        hs.add("Лёд");
        hs.add("Лицо");
        hs.add("Листовка");
        hs.add("Лыжи");
        hs.add("Листья");
        hs.add("Лиловый");
        hs.add("Лимпопо");
        hs.add("Лермонтов");
        hs.add("Лазутчик");
        hs.add("Липа");
        hs.add("Линия");
        hs.add("Лад");
        return hs;
    }
}
