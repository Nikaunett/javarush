package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[3];
        int c;
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 3; i++)
            for (int j = i+1; j < 3; j ++)
                if (arr[i] < arr[j])
                {
                    c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }

        for (int i = 0; i < 3; i++)
            System.out.println(arr[i]);


    }

    public static int min(int x, int y)
    {
        if(x < y) return x;
        else return y;
    }
}
