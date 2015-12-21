package com.javarush.test.level03.lesson12.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by vinner on 07.11.2014.
 */
public class Test  {

public static void main(String[]args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
        int number4 = Integer.parseInt(reader.readLine());

        if(number1 > number2){
            System.out.println(number1);
        }else{
            System.out.println(number2);
        }
}

    public static int max(int a, int b){
       return -1;
    }

}
