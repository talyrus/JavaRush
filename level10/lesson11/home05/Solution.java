package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
д 0
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++)
        {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


       String stroka = "";
        for (int i = 0; i < list.size(); i++)
        {
            stroka += list.get(i).toString(); //все строки, содержащиеся в массиве list (введенном в консоли) собираем в одну строку
        }
        for (Character el : alphabet) // перебор всех символов алфавита
        {
            int count = 0;
            for (Character element : stroka.toCharArray()) //преобразуем строку в массив символов и произведем перебор
            {
                if (element.equals(el)) count++; // если символ из массива равен символу из алфавита, увеличим счетчик
            }
            System.out.println(el + " " + count); // выведем символ алфавита и количество раз, сколько он встретился в массиве символов
        }
    }

}
