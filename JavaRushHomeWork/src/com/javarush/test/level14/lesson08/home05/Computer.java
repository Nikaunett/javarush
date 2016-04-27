package com.javarush.test.level14.lesson08.home05;

/**
 * Created by oshev on 26.04.2016.
 */
public class Computer
{
    private Keyboard    keyboard;
    private Monitor     monitor;
    private Mouse       mouse;

   /* public Computer(Keyboard keyboard)
    {
        this.keyboard = keyboard;
    }

    public Computer(Monitor monitor)
    {
        this.monitor = monitor;
    }

    public Computer(Mouse mouse)
    {
        this.mouse = mouse;
    }*/

    public Computer()
    {
        this.monitor = new Monitor();
        this.mouse = new Mouse();
        this.keyboard = new Keyboard();
    }

    public Keyboard getKeyboard()
    {
        return keyboard;
    }

    public Monitor getMonitor()
    {
        return monitor;
    }

    public Mouse getMouse()
    {
        return mouse;
    }
}
