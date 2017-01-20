package com.javarush.test.level09.lesson11.home08;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //напишите тут ваш код
        ArrayList<int[]> list = new ArrayList<int[]>();

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2};
        int[] arr3 = {1,2,3,4};
        int[] arr4 = {1,2,3,4,5,6,7};
        int[] arr5 = {};

        list.add(arr1);
        list.add(arr2);
        list.add(arr3);
        list.add(arr4);
        list.add(arr5);

        return list;

    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
