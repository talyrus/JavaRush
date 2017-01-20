package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String str_vowels = "";
        String str_con = "";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        text.toCharArray();

        //System.out.println(text);
        try
        {
            for (int i = 0; i < text.length(); i++)
            {
                if (!Character.isWhitespace(text.charAt(i)))
                {
                    if (isVowel(text.charAt(i))) str_vowels += text.charAt(i) + " ";
                    else str_con += text.charAt(i) + " ";
                }
            }
            System.out.println(str_vowels);
            System.out.println(str_con);
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
