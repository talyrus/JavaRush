package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Name = reader.readLine();

        int nY = Integer.parseInt(reader.readLine());
        int nM = Integer.parseInt(reader.readLine());
        int nD = Integer.parseInt(reader.readLine());
        System.out.println("Меня зовут " + Name);
        System.out.println("Я родился " + nD + "." + nM + "." + nY);
    }
}
