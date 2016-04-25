package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String fileName = reader.readLine();


        ArrayList<Integer> list = new ArrayList<Integer>();
        BufferedReader reader1 = new BufferedReader(new FileReader(fileName));


        String x = reader1.readLine();
        while (x != null)
        {
            list.add(Integer.parseInt(x));
            x = reader1.readLine();
        }
        /* InputStream inStream = new FileInputStream(fileName);
        while (inStream.available() > 0)
        {
            String x = (String) inStream.read();
            list.add(x);
        }

        inStream.close();*/

        Collections.sort(list);

        for (int z : list)
        {
            if ( z % 2 == 0) System.out.println(z);
        }


    }
}
