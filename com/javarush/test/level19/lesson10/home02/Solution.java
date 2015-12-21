package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];

        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

        String s;
        Map<String, Double> personsMap = new TreeMap<>();
        while((s = in.readLine()) != null){
            String[] splitStr = s.split(" ");
            String name = splitStr[0];
            Double value = Double.parseDouble(splitStr[1]);
            if(!personsMap.containsKey(name)){
                personsMap.put(name, value);
            }else{
                personsMap.put(name, (personsMap.get(name) + value));
            }
        }

        String theRich = "";
        Double max = 0.0;
        for (Map.Entry<String, Double> pair: personsMap.entrySet()) {
            Double value = pair.getValue();
            String name = pair.getKey();
            if(value > max) {
                max = value;
                theRich = name;
            }
        }

        System.out.println(theRich);

    }
}
