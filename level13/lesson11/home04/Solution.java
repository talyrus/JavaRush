package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        OutputStream outputStream = new FileOutputStream(file);

        while(true)
        {
            String sline = bufferedReader.readLine(); //считываем строку
            String line = sline + "\n";                 // добавляем перенос на новую строку
            byte[] data = line.getBytes();             // получаем массив байт
            for (byte one_byte: data)                  // перебираем массив
            {
                outputStream.write(one_byte);          // записываем байты в поток вывода
            }
            if (sline.equals("exit")) break;            // если exit, прервать цикл while
        }
        bufferedReader.close();                         //закрываем
        outputStream.close();
    }
}
