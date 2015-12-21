package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        String[] strArray = new String[20];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = reader.readLine();
        }


        int[] intArray1 = new int[10];
        int[] intArray2 = new int[10];

        for (int i = 0; i < intArray1.length; i++) {
            intArray1[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < intArray2.length; i++) {
            intArray2[i] = Integer.parseInt(strArray[i + 10]);
            System.out.println(intArray2[i]);
        }

    }
}
