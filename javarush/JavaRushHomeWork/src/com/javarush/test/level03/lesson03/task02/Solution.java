package com.javarush.test.level03.lesson03.task02;

/* Конвертер валют
Реализуйте метод convertEurToUsd, переводящий евро в доллары по заданному курсу.
Вызовите его дважды в методе main с любыми параметрами. Результаты выведите на экран, каждый раз с новой строки.
Подсказка:
Расчет выполняется по формуле: долларСША = евро * курс
*/
public class Solution
{
    public static void main(String[] args) {
        //напишите тут ваш код
        convertEurToUsd(20, 0.5);
        convertEurToUsd(60, 1.2);
    }

    public static double convertEurToUsd(int eur, double course){
        //напишите тут ваш код
        System.out.println (eur * course);
        return (eur * course);
    }
}
