package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<>();
        map.put("Петров","Петр");
        map.put("Иванова","Маша");
        map.put("Петрова","Катя");
        map.put("Иванов","Иван");
        map.put("Демаков","Сергей");
        map.put("Катунцев","Сергей");
        map.put("Степюк","Сергей");
        map.put("Топалев","Максим");
        map.put("Лунин","Петр");
        map.put("Камушкин","Дима");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        //напишите тут ваш код

        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String s = pair.getValue();
            if (s.equals(name)) count = count + 1;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        //напишите тут ваш код
        int count = 0;
        for (Map.Entry<String, String> pair : map.entrySet())
        {
            String s = pair.getKey();
            if (s.equals(lastName)) count++;
        }
        return count;

    }

   /* public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();

        System.out.println("first name : " + getCountTheSameFirstName(map, "Петр"));
        System.out.println("last name : " + getCountTheSameLastName(map, "Иванов"));


    }*/
}
