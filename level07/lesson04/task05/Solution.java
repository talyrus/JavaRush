package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        int[] massBig = new int[20];
        int[] massSmall1 = new int[10];
        int[] massSmall2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < massBig.length; i++)
        {
            massBig[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 10; i++)
        {
            massSmall1[i] = massBig[i];
            //System.out.println(massSmall1[i]);
        }
        for (int i = 0; i < 10; i++)
        {
            massSmall2[i] = massBig[i + 10];
            System.out.println(massSmall2[i]);
        }


    }
}
