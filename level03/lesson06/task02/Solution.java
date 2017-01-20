package com.javarush.test.level03.lesson06.task02;

/* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        int x , y;
        for  (x = 1; x <= 10; x++){
            for (y = 1; y <=10; y++) {
                if (y == 10) {
                    System.out.print(x * y + "\n");
                }
                else {
                    System.out.print(x * y + " ");
                }
            }
        }
    }
}