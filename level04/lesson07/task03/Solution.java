package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
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

        if (nNum1 > 0 && nNum2 > 0 && nNum3 > 0)
        {
            System.out.println(3);
        }
        else if ((nNum1 > 0 && nNum2 > 0 && nNum3 <= 0) || (nNum1 > 0 && nNum2 <= 0 && nNum3 > 0) || (nNum1 <= 0 && nNum2 > 0 && nNum3 > 0))
        {
            System.out.println(2);
        }
        else if ((nNum1 > 0 && nNum2 <= 0 && nNum3 <= 0) || (nNum1 <= 0 && nNum2 <= 0 && nNum3 > 0) || (nNum1 <= 0 && nNum2 > 0 && nNum3 <= 0))
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }

    }
}
