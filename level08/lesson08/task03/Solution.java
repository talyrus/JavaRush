package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
   /* public static void main(String[] args)
    {
        System.out.println(getCountTheSameFirstName(createMap(),"Петр"));
        System.out.println(getCountTheSameLastName(createMap(),"Сергеев"));
    }*/

    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Васильев", "Василий");
        map.put("Сергеевич", "Сергей");
        map.put("Сергеевна", "Иван");
        map.put("Иванова", "Василий");
        map.put("Петрович", "Петр");
        map.put("Петров", "Сергей");
        map.put("Табуреткин", "Петр");
        map.put("Самозванская", "Марфа");
        map.put("Любкина", "Ваврара");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int f = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String value = pair.getValue();
            if (value.equals(name)) f++;

        }
        return f;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int n = 0;
        for (Map.Entry<String,String> pair : map.entrySet())
        {
            String key = pair.getKey();
            if (key.equals(lastName)) n++;
        }
        return n;
    }
}
