package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> out = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        out.add(list.get(0));
        for (int i = 1; i < list.size(); i++)
        {
            if (out.get(0).length() < list.get(i).length())
            {
                out.remove(0);
                out.set(0, list.get(i));
            }
            else if (out.get(0).length() == list.get(i).length())
            {
                out.add(list.get(i));
            }
        }
        for (int i = 0; i < out.size(); i++)
        {
            System.out.println(out.get(i));
        }

    }
}
