package com.javarush.test.level14.lesson06.home01;

/**
 * Created by oshev on 23.04.2016.
 */
public class MoldovanHen extends Hen
{

    @Override
    public int getCountOfEggsPerMonth()
    {
        return 30;
    }
    public String getDescription()
    {
        return super.getDescription() + " Моя страна - "+ Country.MOLDOVA + ". Я несу "+ getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
