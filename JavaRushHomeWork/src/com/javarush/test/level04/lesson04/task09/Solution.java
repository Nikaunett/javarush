package com.javarush.test.level04.lesson04.task09;

/* Светофор
Работа светофора для пешеходов запрограммирована следующим образом: в начале каждого часа в течение трех минут горит зеленый сигнал,
затем в течение одной минуты — желтый, а потом в течение одной минуты — красный, затем опять зеленый горит три минуты и т. д.
0 - 3 - зеленый
3 - 4 - желтый
4 - 5 - красный
5-8
8-9
Ввести с клавиатуры вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зеленый" - если горит зеленый цвет, "желтый" - если горит желтый цвет, "красный" - если горит красный цвет.
Пример для числа 2.5:
зеленый
Пример для числа 3:
желтый
Пример для числа 4:
красный
Пример для числа 5:
зеленый
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        float t = (Float.parseFloat(reader.readLine())%5);
        if (t>3)
            if(t >4)
                System.out.println("красный");
            else
                System.out.println("желтый");
        else
            System.out.println("зеленый");

            double a = Double.parseDouble(reader.readLine());

            a = a % 5;

            if (a >= 0 && a < 3) System.out.println("зеленый");
            else if (a >= 3 && a < 4) System.out.println("желтый");
            else System.out.println("красный");


    }
}