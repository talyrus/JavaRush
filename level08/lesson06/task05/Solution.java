package com.javarush.test.level08.lesson06.task05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/* Четыре метода
Реализовать 4 метода. Они должны возвращать список, который лучше всего подходит для выполнения данных операций (быстрее всего справится с большим количеством операций).
Ничего измерять не нужно.
*/

public class Solution
{
    public static void main(String[] args)
    {
       /* ArrayList<Object> list = new ArrayList<Object>();
        getListForGet(list);
        getListForSet(list);

        LinkedList<Object> linkedList = new LinkedList<Object>();
        getListForAddOrInsert(linkedList);
        getListForRemove(linkedList);*/
    }
    public static List  getListForGet()
    {
        ArrayList list = new ArrayList();
        return list;

    }

    public static List  getListForSet()
    {
        ArrayList list = new ArrayList();
        return list;

    }

    public static List  getListForAddOrInsert()
    {
        LinkedList linkedList = new LinkedList();
        return linkedList;

    }

    public static List  getListForRemove()
    {
        LinkedList linkedList = new LinkedList();
        return linkedList;

    }
}
