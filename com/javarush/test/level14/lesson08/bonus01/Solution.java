package com.javarush.test.level14.lesson08.bonus01;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here
        try
        {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[3]);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object objArr[] = new String[10];
            objArr[0] = new Character('*');

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            Object ch  = new Character('t');
            System.out.println((Byte)ch);

        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] intArr = new int[5];
            intArr = null;
            int i = intArr.length;
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            String szShortString = "Test1";
            Character ch = szShortString.charAt(100);
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new EOFException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new FileNotFoundException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new IOException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        try
        {
            throw new InterruptedException();
        } catch (Exception e)
        {
            exceptions.add(e);
        }
    }
}
