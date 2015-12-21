package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

import java.util.Objects;

public class Solution {
    public Solution(){

    }

    public Solution(String s){

    }

    public Solution(Integer i){

    }

    private Solution(Byte b){

    }

    private Solution(Short s){

    }

    private Solution(Long l){

    }

    protected Solution(Object o){

    }

    protected Solution(Number number){

    }

    protected Solution(String[] arr){

    }

    Solution(Integer[] intArr){

    }

    Solution(Double d){

    }

    Solution(Double[] doubleArr){

    }
}

