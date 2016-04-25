package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        //создай по два объекта каждого класса тут

        Man m1 = new Man("petr", 20, "adr");
        Man m2 = new Man("vas", 26, "adr2");

        Woman w1 = new Woman("anna", 22, "adr3");
        Woman w2 = new Woman("vika", 27, "adr4");

        //выведи их на экран тут

        m1.print();
        m2.print();
        w1.print();
        w2.print();
    }

    //добавьте тут ваши классы

    public static class Man
    {
        public  String name;
        public  String address;
        public  int age;

        public Man(String name,int age,String address){
            this.name = name;
            this.address = address;
            this.age = age;

        }

        public void print(){
            System.out.println(name + " " + age + " " + address);
        }

    }

    public static class Woman
    {
        public  String name;
        public  String address;
        public  int age;

        public Woman(String name,int age,String address){
            this.name = name;
            this.address = address;
            this.age = age;

        }

        public void print(){
            System.out.println(name + " " + age + " " + address);
        }

    }
}
