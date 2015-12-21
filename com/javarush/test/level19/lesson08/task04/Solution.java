package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultOut = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        System.setOut(printStream);

        testString.printSomething();
        String result = byteArrayOutputStream.toString();

        System.setOut(defaultOut);

        String[] splitedStr = result.split(" ");
        int firstNumber = Integer.parseInt(splitedStr[0]);
        String operation = splitedStr[1];
        int secondNumber = Integer.parseInt(splitedStr[2]);

        if(operation.equals("*")){
            System.out.println(firstNumber + " * " + secondNumber + " = " + firstNumber*secondNumber);
        }else if(operation.equals("+")){
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
        }else if(operation.equals("-")){
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber-secondNumber));
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

