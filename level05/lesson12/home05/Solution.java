package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN = reader.readLine();

        int summa = 0;
        while (sN.equals("сумма") == false )
        {
            int iN = Integer.parseInt(sN);
            summa += iN;
            sN = reader.readLine();
        }
        System.out.println(summa);

    }
}
