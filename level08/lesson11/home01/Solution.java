package com.javarush.test.level08.lesson11.home01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Set из котов
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве. Каждый кот с новой строки.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. пункт 3
        Iterator<Cat> iterator = cats.iterator(); // получаем итератор для коллекции <Cat>
        cats.remove(iterator.next()); // метод next() возвращает первый элемент коллекции, который удаляем методом remove()
        //System.out.println("\nПосле удаления имеем: ");
        printCats(cats);
        System.out.println(cats.size());
    }

    public static Set<Cat> createCats()
    {
        //напишите тут ваш код. пункт 2
        HashSet<Cat> catsHashSet = new HashSet<Cat>(); // создаем коллекцию
        catsHashSet.add(new Cat()); // добавляем элементы
        catsHashSet.add(new Cat());
        catsHashSet.add(new Cat());
        /*
        // пробуем вывести созданную коллекцию
        System.out.println("В наличии следующие коты: ");
        for (Cat cc:catsHashSet)
        {
            System.out.println(cc);
        }*/

        return catsHashSet;
    }

    public static void printCats(Set<Cat> cats)
    {
        // пункт 4
        for (Cat cat: cats) // циклом foreach осуществляем перебор всех элементов коллекции
        {
            System.out.println(cat.toString());
        }
    }

    public static class Cat {

    }// пункт 1
}
