package com.javarush.test.level09.lesson11.home09;

import java.io.CharConversionException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();

        /*Cat cat1 = new Cat("AAA");
        map.put("AAA", cat1);*/

        map.put("AAA", new Cat("AAA"));
        map.put("BBB", new Cat("BBB"));
        map.put("CCC", new Cat("CCC"));
        map.put("DDD", new Cat("DDD"));
        map.put("EEE", new Cat("EEE"));
        map.put("FFF", new Cat("FFF"));
        map.put("III", new Cat("III"));
        map.put("JJJ", new Cat("JJJ"));
        map.put("KKK", new Cat("KKK"));
        map.put("LLL", new Cat("LLL"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //напишите тут ваш код
        Set<Cat> catSet = new HashSet<Cat>();

        for (Map.Entry<String, Cat> catEntry: map.entrySet())
        {
            Cat a = catEntry.getValue();
            catSet.add(a);
        }

        return catSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
