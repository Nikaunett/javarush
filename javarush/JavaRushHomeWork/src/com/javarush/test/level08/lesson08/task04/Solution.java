package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1981"));
        map.put("Vasya", new Date("SEPTEMBER 1 1982"));
        map.put("Petya", new Date("NOVEMBER 1 1983"));
        map.put("Kolya", new Date("DECEMBER 1 1984"));
        map.put("Lola", new Date("JULY 1 1985"));
        map.put("Nina", new Date("AUGUST 1 1986"));
        map.put("Misha", new Date("MARCH 1 1987"));
        map.put("Masha", new Date("MARCH 1 1988"));
        map.put("Tasha", new Date("AUGUST 1 1989"));
        map.put("Sasha", new Date("OCTOBER 1 1980"));

        //напишите тут ваш код
        return map;


    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        //напишите тут ваш код
       Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext())
        {
            Date date = iterator.next().getValue();
            int month = date.getMonth();

            if ( month > 4 && month < 8)
            {
                iterator.remove();
            }

        }
    }

      /* public static void main(String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            System.out.println(pair.getValue());
        }

        //System.out.println("first name : " + getCountTheSameFirstName(map, "Петр"));
        //System.out.println("last name : " + getCountTheSameLastName(map, "Иванов"));


    }*/
}
