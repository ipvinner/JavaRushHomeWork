package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }
    public static int max(int number1, int number2){
        if(number1 > number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static long max(long number1, long number2){
        if(number1 > number2){
            return number1;
        }else{
            return number2;
        }
    }

    public static double max(double number1, double number2){
        if(number1 > number2){
            return number1;
        }else{
            return number2;
        }
    }
    //Напишите тут ваши методы
}
