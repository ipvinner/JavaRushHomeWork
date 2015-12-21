package com.javarush.test.level08.lesson08.task05;

import java.util.*;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap<String, String> hashMap = createMap();
        removeTheFirstNameDuplicates(hashMap);
        printMap(hashMap);
    }

    public static HashMap<String, String> createMap()
    {
        //Напишите тут ваш код
        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("Виноградов", "name1");
        hm.put("Петров", "name1");
        hm.put("Иванов","name3");
        hm.put("Сидоров", "name1");
        hm.put("Асадов", "name5");
        hm.put("Виноградов1", "name3");
        hm.put("Слепаков", "name7");
        hm.put("Светлаков", "name8" );
        hm.put("Вассерман", "name8" );
        hm.put("Друзь", "name10");

        return hm;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        Set<String> names = new HashSet<String>();
        Set<String> duplicateNames = new HashSet<String>();

        for ( Map.Entry<String, String> pair : map.entrySet() ) {
            String name = pair.getValue();
            if (names.contains(name) ) {
                duplicateNames.add(name);
            }else {
                names.add(name);
            }
        }

        for ( String name : duplicateNames ){
            removeItemFromMapByValue(map,name);
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void printMap(HashMap<String, String> map){
        for (Map.Entry<String, String> pair: map.entrySet())
        {
            System.out.println("Key: " + pair.getKey() + " value: " + pair.getValue());
        }
    }
}
