package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int nNum = Integer.parseInt(sNum);
        if (nNum > 0)
        {
            System.out.println(nNum * 2);
        }
        else if (nNum < 0)
        {
            System.out.println(nNum + 1);
        }

    }

}