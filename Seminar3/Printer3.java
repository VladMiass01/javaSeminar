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
    public static void analyzeNum(Integer[] mas) {
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println("Minimum is " + mas[0]);
        System.out.println("Maximum is " + mas[mas.length - 1]);
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }
        int aver = sum / mas.length;
        System.out.println("Average is = " + aver);
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
        ans.analyzeNum(arr);
    }
}