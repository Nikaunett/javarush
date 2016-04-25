package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[3];
        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 3; i ++)
            for (int j = i; j < 3; j ++)
            {
                if (arr[i] > arr[j]){
                    int c = arr[i];
                    arr[i] = arr[j];
                    arr[j] = c;
                }
            }
       System.out.print(arr[1]);
    }
}
