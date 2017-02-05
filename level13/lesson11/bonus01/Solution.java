package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String path = reader.readLine();
        FileReader readDate = new FileReader(path);
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader str = new BufferedReader(readDate);
        String line;
        while ( (line = str.readLine()) != null)
        {
            int s = Integer.parseInt(line);
            if (s % 2 == 0)
            {
                arrayList.add(s);
            }
        }
        Collections.sort(arrayList);
        for (Integer ch: arrayList)
        {
            System.out.println(ch);
        }


    }
}
