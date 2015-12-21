package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int number1, int number2){
        if(number1 < number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static long min(long number1, long number2){
        if(number1 < number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static double min(double number1, double number2){
        if(number1 < number2){
            return number1;
        }else{
            return number2;
        }
    }
    //Напишите тут ваши методы
}
