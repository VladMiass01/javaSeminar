/*
Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:
сортирует его по возрастанию и выводит на экран.
Находит минимальное значение в списке и выводит на экран - Minimum is {число}.
Находит максимальное значение в списке и выводит на экран - Maximum is {число}.
Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}.
Напишите свой код в методе analyzeNumbers класса Answer.
Метод analyzeNumbers принимает на вход один параметр:
Integer[] arr - список целых чисел
Пример
arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)
// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5
*/
import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] mas) {
        sort(mas);
    }

    public static void sort(Integer[] mas) {
        int count = mas.length, sum = 0, aver = 0;
        while (count != 0) {
            count = 0;
            sum = mas[mas.length - 1];
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i+1]) {
                    int pock = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = pock;
                    count++;
                }
                sum += mas[i];
            }
            aver = sum / mas.length;
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Minimum is " + mas[0]);
        System.out.println("Maximum is " + mas[mas.length - 1]);
        System.out.println("Average is =  " + aver);
    }
}

public class Printer3 {
    public static void main(String[] args) {
        Integer[] arr = {};
        if (args.length == 0) {
            arr = new Integer[] {1, 3, 5, 7, 9};
        }
        else {
            arr = Arrays.stream(args[0].split(", "))
                    .map(Integer::parseInt)
                    .toArray(Integer[]::new);
        }
        Answer ans = new Answer();
        ans.analyzeNumbers(arr);
    }
}