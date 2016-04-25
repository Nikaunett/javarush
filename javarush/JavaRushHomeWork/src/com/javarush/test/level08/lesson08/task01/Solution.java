package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("Лифт");
        set.add("Лигр");
        set.add("Лампа");
        set.add("Лупа");
        set.add("Луг");
        set.add("Лате");
        set.add("Лаборатория");
        set.add("Лубрикант");
        set.add("Лексикон");
        set.add("Лошадь");
        set.add("Литература");
        set.add("Ласкутки");
        set.add("Ласточка");
        set.add("Лист");
        set.add("Лак");
        set.add("Лук");
        set.add("Лещ");
        set.add("Лакрица");
        set.add("Лимур");
        set.add("Лабуда");

        return set;
    }
}
