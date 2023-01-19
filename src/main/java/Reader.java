package main.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reader {

    // ридер, преобразующий строковую переменную в число, для Задания 1
    public static int readInt() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt((reader.readLine()).trim());
    }

    // ридер для строк для Задания 2
    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }

    // ридер, преобразующий строки в массив чисел для Задания 3
    /*
    public static int[] readArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = (reader.readLine()).trim();

        String [] stringArray = string.split(" ");
        int[]array = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++)

        {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        return array;
    }
     */

    // ридер, преобразующий строки в массив символьных переменных для Задания 3. Вариант 2.

    public static char[] readArray() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = (reader.readLine()).trim();
        return string.toCharArray();
    }
}
