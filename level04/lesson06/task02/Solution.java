package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        String sNum4 = reader.readLine();
        int nNum4 = Integer.parseInt(sNum4);

        if (nNum1 > nNum2 && nNum1 > nNum3 && nNum1 > nNum4)
        {
            System.out.println(nNum1);
        }
        else if (nNum2 > nNum1 && nNum2 > nNum3 && nNum2 > nNum4)
        {
            System.out.println(nNum2);
        }
        else if (nNum3 > nNum1 && nNum3 > nNum2 && nNum3 > nNum4)
        {
            System.out.println(nNum3);
        }
        else
        {
            System.out.println(nNum4);
        }


    }
}
