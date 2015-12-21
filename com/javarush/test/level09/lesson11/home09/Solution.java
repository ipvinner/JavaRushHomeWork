package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> stringCatMap = new HashMap<String, Cat>();
        stringCatMap.put("мурзик", new Cat("мурзик"));
        stringCatMap.put("барсик", new Cat("барсик"));
        stringCatMap.put("name1", new Cat("name1"));
        stringCatMap.put("name2", new Cat("name2"));
        stringCatMap.put("name3", new Cat("name3"));
        stringCatMap.put("name4", new Cat("name4"));
        stringCatMap.put("name5", new Cat("name5"));
        stringCatMap.put("name6", new Cat("name6"));
        stringCatMap.put("name7", new Cat("name7"));
        stringCatMap.put("name8", new Cat("name8"));

        return stringCatMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
            Cat value = pair.getValue();
            set.add(value);
        }

        return set;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
