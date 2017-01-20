package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача конструктора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    private String sName = null;
    private String sColor;
    private String sAddress = null;
    private int nAge = 3;
    private int nWeight = 5;

    public Cat(String name)
    {
        this.sName = name;
    }

    public Cat(String name, int weight, int age)
    {
        this.sName = name;
        this.nWeight = weight;
        this.nAge = age;
    }

    public Cat(String name, int age)
    {
        this.sName = name;
        this.nAge = age;
    }

    public Cat(int weight, String color)
    {
        this.nWeight = weight;
        this.sColor = color;
    }

    public Cat(String color, int weight, String address)
    {
        this.nWeight = weight;
        this.sColor = color;
        this.sAddress = address;
    }



}
