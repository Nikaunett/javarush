package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        List< String> dateMap = new LinkedList<String>();
        dateMap.add("January");
        dateMap.add("February");
        dateMap.add("March");
        dateMap.add("April");
        dateMap.add("May");
        dateMap.add("June");
        dateMap.add("July");
        dateMap.add("August");
        dateMap.add("September");
        dateMap.add("October");
        dateMap.add("November");
        dateMap.add("December");
        for (int i = 0; i < dateMap.size(); i++)
        {
            if(dateMap.get(i).equals(s)){
                System.out.println(dateMap.get(i)+" is "+ (i+1)+" month");
            }
        }



    }

}
