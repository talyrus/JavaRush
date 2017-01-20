package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int nN = Integer.parseInt(reader.readLine());
        int[] mass = new int[nN];
        if (nN > 0)
        {
            for (int i = 0; i < nN; i++)
            {
                mass[i] = Integer.parseInt(reader.readLine());
            }
        }
        Arrays.sort(mass);
        maximum = mass[nN-1];
      System.out.println(maximum);
    }
}
