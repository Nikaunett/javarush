package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        String s = null;
        int summ = 0;
        int x = Integer.parseInt(reader.readLine());
        while (1 > 0){
            summ = summ + x;

            s = reader.readLine();
            if (s.equals("сумма")) break;
            else x = Integer.parseInt(s);
        }

        System.out.println(summ);
    }
}
