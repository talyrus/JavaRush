package com.javarush.test.level08.lesson11.home04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/* Минимальное из N чисел
1. Ввести с клавиатуры число N.
2. Считать N целых чисел и заполнить ими список - метод getIntegerList.
3. Найти минимальное число среди элементов списка - метод getMinimum.
*/

public class Solution
{
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Найти минимум
        int m = array.get(0);

        for (int i = 1; i < array.size(); i++)
        {
            if (array.get(i) < m) m = array.get(i);
        }

        return m;
    }

    public static List<Integer> getIntegerList() throws IOException {
        //Организуем ввод числа с клавиатуры
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(bufferedReader.readLine());
        //System.out.println("count: " + count);

        //Тут создать и заполнить список
        ArrayList arrayList = new ArrayList();
        //Считаем необходимое количество раз целые числа и заполним ими список
        for (int i = 0; i < count; i++)
        {
            arrayList.add(Integer.parseInt(bufferedReader.readLine()));
        }
        return arrayList;
    }
}
