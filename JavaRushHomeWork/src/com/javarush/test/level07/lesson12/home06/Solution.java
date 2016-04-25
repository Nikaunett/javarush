package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        Human GrandMa1 = new Human( "Masha", 51, false);
        Human GrandMa2 = new Human( "Natasha",62, false);
        Human GrandFa1 = new Human( "Misha",54, true);
        Human GrandFa2 = new Human( "Sasha",65, true);
        Human Father = new Human( "Kolya", 35, true, GrandMa1, GrandFa1);
        Human Mother = new Human( "Nastya", 30,  false, GrandMa2, GrandFa2);
        Human son1 = new Human( "Nikita", 10, true, Mother, Father);
        Human son2 = new Human( "Misha",7,  true, Mother, Father);
        Human douther = new Human( "Dasha",2,  false, Mother, Father);

        System.out.println(GrandMa1.toString());
        System.out.println(GrandMa2.toString());
        System.out.println(GrandFa1.toString());
        System.out.println(GrandFa2.toString());
        System.out.println(Father.toString());
        System.out.println(Mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(douther.toString());


    }

    public static class Human
    {
        //напишите тут ваш код
        String name = null;
        boolean sex;
        int age;
        Human father = null;
        Human mother = null;;
        /*Human grFam;
        Human grFaf;
        Human grMam;
        Human grMaf;*/

        public Human(String name,int age, boolean sex, Human mother, Human father)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.mother = mother;
            this.father = father;

        }

        public Human(String name,int age, boolean sex)
        {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }



        public String toString()
        {
            //Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
