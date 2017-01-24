package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) влияет на результат.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++)
        {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list)
    {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        //напишите тут ваш код
        ArrayList<String> secondList = list; //создаем второй список и копируем в него первый


        for (int i = 0; i < list.size(); i++) //берем слово из первого списка
        {
            int count = 0;
            for (int j = 0; j < secondList.size(); j++) // берем слово из второго списка
            {
                if (secondList.get(j).equals(list.get(i))) // сравниваем значение из второго списка с первым
                {
                  count++; // если значения равны - увеличиваем счетчик
                }
            }
            result.put(list.get(i), count); // добавляем в словарь значение  и количество повторов слова
        }


        return result;
    }

}
