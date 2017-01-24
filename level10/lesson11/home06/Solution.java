package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    private static class Human
    {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private String lastName;
        private boolean sex;
        private int age;
        private double weight;
        private int height;

        // N 1
        private Human(String name, String lastName, boolean sex, int age, double weight, int height)
        {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
        // N 2
        private Human(String name, String lastName)
        {
            this.name = name;
            this.lastName = lastName;
        }
        // N 3
        private Human(String lastName, boolean sex)
        {
            this.lastName = lastName;
            this.sex = sex;
        }
        // N 4
        private Human(String lastName, int age)
        {
            this.lastName = lastName;
            this.age = age;
        }
        // N 5

        private Human(String lastName, boolean sex, int age)
        {
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
        }

        // N 6

        private Human(String name)
        {
            this.name = name;
        }


        // N 7

        private Human(String lastName, double weight)
        {
            this.lastName = lastName;
            this.weight = weight;
        }


        // N 8

        private Human(String lastName, double weight, int height)
        {
            this.lastName = lastName;
            this.weight = weight;
            this.height = height;
        }


        // N 9

        private Human(String lastName, boolean sex, int age, int height)
        {
            this.lastName = lastName;
            this.sex = sex;
            this.age = age;
            this.height = height;
        }


        // N 10

        private Human(String lastName, int age, double weight)
        {
            this.lastName = lastName;
            this.age = age;
            this.weight = weight;
        }
    }
}
