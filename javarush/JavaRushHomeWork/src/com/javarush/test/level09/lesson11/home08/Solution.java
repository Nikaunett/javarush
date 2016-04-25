package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        int[] l5 = {1, 2, 3, 4, 5};
        int[] l2 = {11, 12};
        int[] l4 = {21, 22, 23, 24};
        int[] l7 = {31, 32, 33, 34, 35, 36, 37};
        int[] l0 = {};

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(l5);
        list.add(l2);
        list.add(l4);
        list.add(l7);
        list.add(l0);

        return list;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
