package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Cat c1 = new Cat("Vasya", 2, 3, 6);
        Cat c2 = c1;// new Cat("Vasya", 2, 3, 6);
        Cat c3 = new Cat("Tishka", 3, 4, 9);
        System.out.println(c1.equals(c2));


        Integer a = new Integer(6);
        Integer b = new Integer(6);
        System.out.println(a == b); // false т.к. это разные объекты с разными ссылками
        System.out.println(a.equals(b)); // true, здесь уже задействована логика сравнения
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Mama");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }

    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
