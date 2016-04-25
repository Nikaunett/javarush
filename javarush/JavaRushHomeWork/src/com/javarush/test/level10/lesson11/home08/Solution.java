package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код
        ArrayList<String>[] array = new ArrayList[2];

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("asd");
        list1.add("zxc");
        list1.add("vcx");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("qwe");
        list2.add("ewq");
        list2.add("wqe");

        array[0] = list1;
        array[1] = list2;

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}