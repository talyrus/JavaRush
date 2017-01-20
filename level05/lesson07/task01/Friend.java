package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    private String sName, sGender;
    private int sAge;

    public void initialize(String name)
    {
        this.sName = name;
    }

    public void initialize(String name, int age)
    {
        this.sName = name;
        this.sAge = age;
    }

    public void initialize(String name, int age, String gender)
    {
        this.sName = name;
        this.sAge = age;
        this.sGender = gender;
    }
}
