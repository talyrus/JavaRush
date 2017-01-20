package com.javarush.test.level07.lesson12.bonus03;
/**
 * Сортировка пузырьком с убыванием
 * @author Vitaliy
 * @version 1.0
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    /**
     * Сортировка пузырьком с убыванием
     * */

    {
        for (int i = array.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[j] < array[j + 1] )
                {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
    /**
     * Сортировка пузырьком с возрастанием
     *
   *Внешний цикл каждый раз сокращает фрагмент массива,
    *  так как внутренний цикл каждый раз ставит в конец
     * фрагмента максимальный элемент
      *@code
     * <pre>
    *for(int i = arr.length-1 ; i > 0 ; i--){
    *for(int j = 0 ; j < i ; j++){
     *       *//*Сравниваем элементы попарно,
      *        если они имеют неправильный порядок,
       *       то меняем местами
        *    if( arr[j] > arr[j+1] ){
         *       int tmp = arr[j];
          *      arr[j] = arr[j+1];
           *     arr[j+1] = tmp;
          *  }
       * }
    *}
    * </pre>*/
}
