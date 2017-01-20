package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные,
но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sWord1 = reader.readLine();
        String sWord2 = reader.readLine();
        //System.out.println(sWord1);
        //System.out.println(sWord2);

        if (sWord1.equals(sWord2) )
        {
            System.out.println("Имена идентичны");
        }
        else if (!(sWord1.equals(sWord2)) && sWord1.length() == sWord2.length() )
        {
            System.out.println("Длины имен равны");
        }

    }
}
