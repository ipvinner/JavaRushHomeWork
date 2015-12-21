package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
//    public static void main(String[] args) {
//        HashMap<String, Date> map = createMap();
//        removeAllSummerPeople(map);
//    }
    public static HashMap<String, Date> createMap()
    {
        //System.out.println("CREATE map");
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Путин", new Date("JUNE 7 1952"));
        map.put("Арбакайте", new Date("JUNE 8 1953"));
        map.put("Роналдо", new Date("JUNE 8 1980"));
        map.put("Виноградов", new Date("JULY 4 1988"));
        map.put("Кадыров", new Date("SEPTEMBER 15 1975"));
        map.put("Татаринов", new Date("DECEMBER 15 1976"));
        map.put("Батыршинов", new Date("JULY 4 1988"));
        map.put("Кабардинов", new Date("AUGUST 14 1975"));
        map.put("Степанов", new Date("APRIL 11 1960"));
        //Напишите тут ваш код
        return  map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {

        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            Date date = pair.getValue();
            String key = pair.getKey();
            String temp = date.toString().split(" ")[1];
            if(temp.equals("Jul") || temp.equals("Jun") || temp.equals("Aug")){
                //System.out.println("true");
                iterator.remove();
            }
        }

//        for(Map.Entry<String, Date> pair : map.entrySet()){
//            String key = pair.getKey();
//            Date date = pair.getValue();
//            System.out.println(key + ":" + date);
//
//        }
    }
}
