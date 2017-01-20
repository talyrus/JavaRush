package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из строчек в обратном порядке
1. Создать массив на 10 строчек.
2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //напишите тут ваш код
        String[] stroka = new String[10]; // создаем массив из 10 строчек
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       // System.out.println(stroka.length);
        for (int i = 0; i < stroka.length - 2; i++) // 8 строчек
        {
        //    System.out.println("Записываем в Индекс - " + i + " строчку номер - " + i+1);
            stroka[i] = reader.readLine(); //Вводим с клавиатуры  и сохраняем их в массив.
        }

        for (int i = stroka.length - 1; i >= 0 ; i--)
        {
           // System.out.println("Читаем из индекса - " + i);
            System.out.println(stroka[i]);
        }

    }
}