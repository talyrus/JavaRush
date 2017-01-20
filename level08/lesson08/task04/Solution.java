package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    /*public static void main(String[] args)
    {
       System.out.println(createMap());
        removeAllSummerPeople(createMap());
    }*/
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("User1", new Date("JUNE 1 1980"));
        map.put("User2", new Date("JULY 22 1947"));
        map.put("User3", new Date("AUGUST 28 1976"));
        map.put("User4", new Date("SEPTEMBER 17 3100"));
        map.put("User5", new Date("NOVEMBER 2 2033"));
        map.put("User6", new Date("DECEMBER 1 2011"));
        map.put("User7", new Date("JANUARY 10 1876"));
        map.put("User8", new Date("FEBRUARY 5 1555"));
        map.put("User9", new Date("MARCH 25 1778"));
        map.put("User10", new Date("APRIL 14 1978"));
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for (Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator(); iterator.hasNext();)
        {
            Map.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() >= 5 && pair.getValue().getMonth() <= 7 )
            {
                iterator.remove();
            }
        }
       //System.out.println(map);

    }
}
