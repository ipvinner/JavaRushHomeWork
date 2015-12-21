package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {

    public static void main(String[] args) {
        Map<String, String> selectMap = new HashMap<>();
        selectMap.put("name", "Ivanov");
        selectMap.put("country", null);
        selectMap.put("city", "Kiev");
        selectMap.put("age", null);
        selectMap.put("height", "185");
        selectMap.put(null, null);
        selectMap.put(null, null);
        selectMap.put(null, null);

        System.out.println(getCondition(selectMap));
    }

    public static StringBuilder getCondition(Map<String, String> params) {

        StringBuilder result = new StringBuilder();

        Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            if(value != null & key != null) {
                if(iterator.hasNext()){
                    result.append(pair.getKey() + " = " + "'" + pair.getValue() + "' and ");
                }else {
                    result.append(pair.getKey() + " = " + "'" + pair.getValue() + "'");
                }
            }
        }


        return result;
    }
}
