package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.

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
        Human ded1 = new Human();
        ded1.age = 55;
        ded1.name = "Egor";
        ded1.sex = true;

        Human ded2 = new Human();
        ded2.age = 54;
        ded2.name = "Matvey";
        ded2.sex = true;

        Human baba1 = new Human();
        baba1.age = 40;
        baba1.name = "Anna";
        baba1.sex = false;

        Human baba2 = new Human();
        baba2.age = 44;
        baba2.name = "Manya";
        baba2.sex = false;

        Human otec = new Human();
        otec.age = 25;
        otec.name = "Semen";
        otec.sex = true;
        otec.father = ded1;
        otec.mother = baba1;

        Human mama = new Human();
        mama.age = 25;
        mama.name = "Yana";
        mama.sex = false;
        mama.father = ded2;
        mama.mother = baba2;

        Human doch1 = new Human();
        doch1.age = 5;
        doch1.name = "Sonya";
        doch1.sex = false;
        doch1.father = otec;
        doch1.mother = mama;

        Human doch2 = new Human();
        doch2.age = 15;
        doch2.name = "Masha";
        doch2.sex = false;
        doch2.father = otec;
        doch2.mother = mama;

        Human doch3 = new Human();
        doch3.age = 15;
        doch3.name = "Sara";
        doch3.sex = false;
        doch3.father = otec;
        doch3.mother = mama;

        System.out.println(ded1.toString());
        System.out.println(ded2.toString());
        System.out.println(baba1.toString());
        System.out.println(baba2.toString());
        System.out.println(otec.toString());
        System.out.println(mama.toString());
        System.out.println(doch1.toString());
        System.out.println(doch2.toString());
        System.out.println(doch3.toString());


    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public String toString()
        {
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
