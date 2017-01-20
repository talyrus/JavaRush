package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
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

        if (nNum1 > nNum2)
        {
            System.out.println(nNum2);
        }
        else
            System.out.println(nNum1);

    }
}