package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.
  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int nNum = Integer.parseInt(reader.readLine());
        int Sum = 0;

        while (nNum != -1)
        {
            Sum += nNum;
            nNum = Integer.parseInt(reader.readLine());
        }
        System.out.println(Sum - 1);
    }
}
