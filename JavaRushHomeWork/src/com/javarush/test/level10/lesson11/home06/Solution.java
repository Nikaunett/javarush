package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        boolean sex;
        Human mother;
        Human father;
        ArrayList<Human> children;


        public Human(String name, boolean sex, int age)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = null;
        }
        public Human(String name, boolean sex, int age, Human mother, Human father)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            this.children = null;
        }
        public Human(String name, boolean sex, int age, Human mother, Human father, ArrayList<Human> children)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            this.children = children;
        }
        public Human(String name, boolean sex)
        {
            this.name = name;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = null;
        }
        public Human(boolean sex, int age)
        {
            this.name = null;
            this.age = age;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = null;
        }
        public Human(boolean sex)
        {
            this.name = null;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = null;
        }
        public Human(String name, boolean sex, Human mother, Human father)
        {
            this.name = name;
            this.sex = sex;
            this.mother = mother;
            this.father = father;
            this.children = null;
        }
        public Human(String name, boolean sex, int age, ArrayList<Human> children)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = children;
        }
        public Human( boolean sex, int age, ArrayList<Human> children)
        {
            this.name = null;
            this.age = age;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = children;
        }
        public Human(String name, boolean sex, ArrayList<Human> children)
        {
            this.name = name;
            this.sex = sex;
            this.mother = null;
            this.father = null;
            this.children = children;
        }
    }
}
