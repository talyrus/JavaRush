package com.javarush.test.level04.lesson04.task10;

/* Три числа
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел. Если все три числа равны между собой, то вывести все три.
Пример для чисел 1 2 2:
2 2
Пример для чисел 2 2 2:
2 2 2
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum1 = reader.readLine();
        int nNum1 = Integer.parseInt(sNum1);
        String sNum2 = reader.readLine();
        int nNum2 = Integer.parseInt(sNum2);
        String sNum3 = reader.readLine();
        int nNum3 = Integer.parseInt(sNum3);

        if (nNum1 == nNum2 && nNum1 != nNum3)
        {
            System.out.println(nNum1 + " " + nNum2);
        }
        else if (nNum2 == nNum3 && nNum2 != nNum1)
        {
            System.out.println(nNum2 + " " + nNum3);
        }
        else if (nNum1 == nNum3 && nNum1 != nNum2)
        {
            System.out.println(nNum1 + " " + nNum3);
        }
        else if (nNum1 == nNum2 && nNum1 == nNum3)
        {
            System.out.println(nNum1 + " " + nNum2+ " " + nNum3);
        }

    }
}