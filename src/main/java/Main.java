package main.java;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Задание 1
        System.out.println("Задание 1. Введите число. \nЕсли оно больше семи, то я скажу вам \"Привет\", \nа если меньше или равно, \nто мы перейдем к следующему заданию");

        int num;
        try {
            num = Reader.readInt();
            if (num > 7) {
                System.out.println("Привет");
            }
        }
        catch (Exception e) {
            System.out.println("Это не число!");
        }

        Thread.sleep(1000);
        System.out.println("Переходим к следующему заданию!");
        Thread.sleep(1000);

        // Задание 2
        System.out.println("Задание 2. Введите имя. Если вы Вячеслав, то я с вами поздороваюсь.\nДругих имен для меня не существует.");

        String name = (Reader.readString().toLowerCase());

        if (name.contains("вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        Thread.sleep(1000);
        System.out.println("Переходим к следующему заданию!");
        Thread.sleep(1000);

        /*
        Задание 3. Вариант 1.
        Принимает только числа через 1 пробел.
        Например, 1 2 3 4 5 6 7 8 9 10
         */

        System.out.println("Задание 3. Введите, пожалуйста, любые числа через пробел. \nТогда я верну вам те из них, которые кратны трем");
        /*
        try {
            int[] array = Reader.readArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 3 == 0) {
                    System.out.print(array[i] + " ");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Условия задания нарушены, я не смог распознать числа вовсе");
        }
         */

        /*
        Задание 3. Вариант решения 2. Менее строгий.
        Ищет числа в предложениях.
        Например, "У меня на ферме 3 курицы, 14 цыплят, 21 утка, 44 утенка"
        */


        char[] charArray = Reader.readArray();

        StringBuilder helpString = new StringBuilder();

        for (int i = 0; i < charArray.length-1; i++) {

            if (charArray[i] >=48 && charArray[i]<=57) {
                helpString.append(charArray[i]);
                if (!(charArray[i+1] >=48 && charArray[i+1]<=57)){
                    int helpInt = Integer.parseInt(helpString.toString());
                    if (helpInt%3==0) {
                        System.out.print(helpInt + " ");
                    }
                    helpString = new StringBuilder();
                }
            }
        }

        if (charArray[charArray.length-1] >=48 && charArray[charArray.length-1]<=57) {
            helpString.append(charArray[charArray.length - 1]);
            int helpInt = Integer.parseInt(helpString.toString());
            if (helpInt%3==0) {
                System.out.print(helpInt + " ");
            }
        }

        Thread.sleep(1000);
        System.out.println("\nВсе задания выполнены!");
    }
}