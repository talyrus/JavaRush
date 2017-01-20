package com.javarush.test.level08.lesson11.home09;

import java.util.Date;



/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
       //System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date)
    {
        long day = (long) 24 * 60 * 60 * 1000; // количество милисекунд в сутках
        Date endDate = new Date(date);
        Date startData = new Date(endDate.getYear(),0,1);

        return ((startData.getTime() - endDate.getTime()) / day % 2 == 0);
    }
}
