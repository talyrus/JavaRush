package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        //напишите тут ваш код
        ArrayList<Human> family = new ArrayList<>();
        family.add(new Human("Сын", true, 10, null));
        family.add(new Human("Сын", true, 12, null));
        family.add(new Human("Дочь", false, 2, null));
        family.add(new Human("Отец", true, 37, family.get(0), family.get(1), family.get(2)));
        family.add(new Human("Мать", false, 34, family.get(0), family.get(1), family.get(2)));
        family.add(new Human("Дед1", true, 57, family.get(3)));
        family.add(new Human("Баба1", false, 54, family.get(3)));
        family.add(new Human("Дед2", true, 58, family.get(4)));
        family.add(new Human("Баба2", false, 53, family.get(4)));

        for (Human human : family)
        {
            System.out.println(human);
        }
    }

    public static class Human
    {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, Human... child)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            if (child != null)
            {
                for (Human human : child)
                {
                    this.children.add(human);
                }
            }
        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }
}
