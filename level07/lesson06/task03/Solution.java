package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        ArrayList<String> arr = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++)
        {
            arr.add(reader.readLine());
        }

        ArrayList<String> out = new ArrayList<String>();
        out.add(arr.get(0));

        for (int i = 1; i < arr.size(); i++)
        {
            if (out.get(0).length() > arr.get(i).length())
            {
                out.remove(0);
                out.add(arr.get(i));
            }
            else if (out.get(0).length() == arr.get(i).length())
            {
                out.add(arr.get(i));
            }
        }
        for (int i = 0; i < out.size(); i++)
        {
            System.out.println(out.get(i));
        }



    }
}
