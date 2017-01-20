package com.javarush.test.level08.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Пять наибольших чисел
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Вывести пять наибольших чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array)
    {
        //напишите тут ваш код
        //Сортировка выбором.

        for (int i = 0; i < array.length; i++) //перебираем все элементы массива
        {
            int max = array[i]; // считаем, что нулевой элемент массива максимальный
            int max_i = i; // запоминаем его индекс
            for ( int j = i + 1; j < array.length; j++) //перебираем все элементы массива, сравнивая с каждым элементом, кроме нулевого
            {
                if (array[j] > max) //если сравниваемое значение больше взятого
                {
                    max = array[j];// то запоминаем это значение, как максимальное
                    max_i = j; // и запоминаем его индекс
                }
            }
            if (i != max_i) //если проверяемое число больше предполагаемого, то индексы будут не равны
            {
                int tmp = array[i]; //запоминаем предполагаемое значение во временную переменную
                array[i] = array[max_i]; // меняем значения местами
                array[max_i] = tmp;
            }
        }
    }
}
