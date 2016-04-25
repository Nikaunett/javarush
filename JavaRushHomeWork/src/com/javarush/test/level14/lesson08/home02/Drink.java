package com.javarush.test.level14.lesson08.home02;

/**
 * Created by oshev on 24.04.2016.
 */
/*1. Создать абстрактный класс Drink с реализованным методом public void taste(), который выводит в консоль "Вкусно"
2. Создать класс Wine, который наследуется от Drink, с реализованным методом public String getHolidayName(), который возвращает строку "День рождения"
3. Создать класс BubblyWine, который наследуется от Wine, с реализованным методом public String getHolidayName(), который возвращает строку "Новый год"
4. Написать реализацию методов getDeliciousDrink, getWine, getBubblyWine
5. Каждый класс и интерфейс должны быть в отдельных файлах
6. Метод main менять нельзя!*/
public abstract class Drink
{
    public void taste()
    {
        System.out.println("Вкусно");
    }
}
