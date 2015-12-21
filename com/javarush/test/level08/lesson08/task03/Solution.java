package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args) {
        HashMap <String, String> map = createMap();
        System.out.println(getCountTheSameLastName(map, "Виноградов"));
        System.out.println(getCountTheSameFirstName(map, "name1"));

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
        hm.put("Виноградов1", "name6");
        hm.put("Слепаков", "name7");
        hm.put("Светлаков", "name8" );
        hm.put("Вассерман", "name9" );
        hm.put("Друзь", "name10");

        return  hm;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {

        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        String firstName;
        while(iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            firstName = pair.getValue();
            if(firstName.equals(name)) {
                count++;
            }
        }
        //Напишите тут ваш код
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,String> pair = iterator.next();
            String lastName = pair.getKey();

            if(lastName.equals(familiya)) {
                count++;
            }
        }
        //Напишите тут ваш код
        return count;

    }
}
