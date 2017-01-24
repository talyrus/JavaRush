package com.javarush.test.level10.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //напишите тут ваш код

        ArrayList<String> list1 = new ArrayList<String>(); // создаем списки строк
        list1.add("list1 - test");  //добавляем элементы в список
        list1.add("list1 - test2");
        list1.add("list1 - test3");
        list1.add("list1 - test4");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("list2 - test");
        list2.add("list2 - test2");
        list2.add("list2 - test3");
        list2.add("list2 - test4");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("list3 - test");
        list3.add("list3 - test2");
        list3.add("list3 - test3");
        list3.add("list3 - test4");

        ArrayList<String> list4 = new ArrayList<String>();
        list4.add("list4 - test");
        list4.add("list4 - test2");
        list4.add("list4 - test3");
        list4.add("list4 - test4");

        ArrayList<String> list5 = new ArrayList<String>();
        list5.add("list5 - test");
        list5.add("list5 - test2");
        list5.add("list5 - test3");
        list5.add("list5 - test4");

        ArrayList<String>[] arrayLists = new ArrayList[5]; // создаем массив с количеством элементов, равным количеству списков строк

        arrayLists[0] = list1; //присваиваем списки элементам массива
        arrayLists[1] = list2;
        arrayLists[2] = list3;
        arrayLists[3] = list4;
        arrayLists[4] = list5;

        return arrayLists; // возвращаем массив
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}