/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
*/
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        boolean work = true;
        while (work) {
            String line = scan.nextLine();
            switch (line) {
                case "print":
                    for (String s: list) {
                        System.out.println(s);
                    }
                    break;
                case "revert":
                    list.remove(0);
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(0, line);
            }
        }
    }
}