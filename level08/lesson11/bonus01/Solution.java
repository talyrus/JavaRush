package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //напишите тут ваш код
        Scanner scanner= new Scanner(System.in);
        String month = scanner.nextLine();

        Map<String,Integer> result = new HashMap<String, Integer>();
        result.put("January", 1);
        result.put("February", 2);
        result.put("March", 3);
        result.put("April", 4);
        result.put("May", 5);
        result.put("June", 6);
        result.put("July", 7);
        result.put("August", 8);
        result.put("September", 9);
        result.put("October", 10);
        result.put("November", 11);
        result.put("December", 12);

        System.out.println(month + " is " + result.get(month) + " month");

    }

}
