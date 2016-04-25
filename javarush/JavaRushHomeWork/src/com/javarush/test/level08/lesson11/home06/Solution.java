package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код

        Human son1 = new Human("James", true, 13);
        Human son2 = new Human("Lily", false, 11);
        Human doughter = new Human("Albus-Severus", true, 10);
        ArrayList<Human> children = new ArrayList<Human>();
        ArrayList<Human> children1 = new ArrayList<Human>();
        ArrayList<Human> children2 = new ArrayList<Human>();

        children.add(son1);
        children.add(son2);
        children.add(doughter);

        Human Father = new Human("Harry", true, 36, children);
        Human Mother = new Human("Jinny", false, 36, children);

        children1.add(Father);
        children2.add(Mother);


        Human grFa1 = new Human("James", true, 50, children1);
        Human grMa1 = new Human("Lily", false, 50, children1);
        Human grFa2 = new Human("Artur", true, 55, children2);
        Human grMa2 = new Human("Molly", false, 55, children2);

        System.out.println(grFa1);
        System.out.println(grMa1);
        System.out.println(grFa2);
        System.out.println(grMa2);
        System.out.println(Father);
        System.out.println(Mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(doughter);

    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
