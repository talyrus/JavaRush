package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

import java.util.PriorityQueue;

public class Cat
{
    private String sName = null;
    private String sColor;
    private String sAddress = null;
    private int nAge = 3;
    private int nWeight = 5;

    public void initialize(String name) {
        this.sName = name;
    }

    public void initialize(String name, int weight, int age) {
        this.sName = name;
        this.nWeight = weight;
        this.nAge = age;
    }

    public void initialize(String name, int age) {
        this.sName = name;
        this.nAge = age;
    }

    public void initialize(int weight, String color) {
        this.nWeight = weight;
        this.sColor = color;
    }

    public void initialize(int weight, String color, String address) {
        this.nWeight = weight;
        this.sColor = color;
        this.sAddress = address;
    }

}
