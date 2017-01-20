package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

   /* public static void main(String[] args)
    {
        System.out.println(createSet());
        System.out.println(removeAllNumbersMoreThan10(createSet()));
    }*/
    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> list = new HashSet<Integer>();
        for (int i = 0; i < 20; i++)
        {
            list.add(i);
        }
        return list;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            int i = iterator.next();
            if(i > 10) iterator.remove();
        }
        return set;
    }
}
