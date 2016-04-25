package com.javarush.test.level08.lesson08.task02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i < 21; i ++){
            set.add(i);
        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //напишите тут ваш код
        /*HashSet<Integer> newset= new HashSet<Integer>();

        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()){
            Integer x = iter.next();
            if (x <= 10) newset.add(x);  тоже работает
        }
        return newset;*/

        Iterator<Integer> iter = set.iterator();

        while (iter.hasNext()){
            int x = iter.next();
            if( x > 10) iter.remove();
        }
        return set;
    }

   /* public static void main(String[] args)
    {
        HashSet<Integer> set = createSet();
        set = removeAllNumbersMoreThan10(set);
        for( Integer x : set){
            System.out.println(x);
        }

            System.out.println(set.size());

    }*/


}