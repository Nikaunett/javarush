package com.javarush.test.level07.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Нужно заменить функциональность программы
Задача:  Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter). Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на экран.
Новая задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если нечётное – утраивается.
Программа выводит содержимое нового списка на экран.
Пример ввода:
Кот
Коты
Я
Пример вывода:
Кот Кот Кот
Коты Коты
Я Я Я
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String s = list.get(i);
            if (s.length() % 2 == 0)
            {
                listUpperCase.add(s);
                listUpperCase.add(s);

            }
            else
            {
                listUpperCase.add(s);
                listUpperCase.add(s);
                listUpperCase.add(s);
            }
        }

        for (int i = 0; i < listUpperCase.size(); i++)
        {
            String s = listUpperCase.get(i);
            int x = Collections.frequency(listUpperCase, s);

            for (int j = 0;j < x; j ++ )
            {
                System.out.print(s);
                if (j + 1 != x) System.out.print(" ");
            }
            System.out.println("");
            i = i + x-1;

        }
    }
}
