package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "Cp1251" ));

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

        for (Map.Entry<String, Double> pair: personsMap.entrySet()) {
            String key = pair.getKey();
            Double value = pair.getValue();
            System.out.println(key + " " + value);

        }
    }
}
