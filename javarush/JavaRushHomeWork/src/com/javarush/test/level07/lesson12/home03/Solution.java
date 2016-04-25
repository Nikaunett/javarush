package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        int  maximum = 0;
        int  minimum = 0;

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i ++)
        {
            Integer x = Integer.parseInt(reader.readLine());
            list.add(x);
            //if (maximum < x) maximum = x;
            //if (minimum > x) minimum = x;
        }
        maximum = 0;//list.get(0);
        minimum = 0;//list.get(0);
        for (int i = 0; i < list.size(); i ++)
        {
            int x = list.get(i);
            if (maximum < x) maximum = x;
            if (minimum > x) minimum = x;
        }

        //напишите тут ваш код

        System.out.print(maximum + " " + minimum);
       /* System.out.println(maximum); это было изначально в коде, но и так не проходит тестирование
        System.out.println(minimum);*/
    }
}
