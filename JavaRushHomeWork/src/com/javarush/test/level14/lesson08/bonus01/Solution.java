package com.javarush.test.level14.lesson08.bonus01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
        try
        {
            FileInputStream file = new FileInputStream( "c:/txt.txt" );
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            FileOutputStream file = new FileOutputStream("c:/txt.txt");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] a = {1};
            a[2] = 5;

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            ArrayList<String> list = null;
            list.add("hello");
        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {

        }
        catch (Exception e)
        {
            exceptions.add(e);
        }
        //Add your code here

    }
}
