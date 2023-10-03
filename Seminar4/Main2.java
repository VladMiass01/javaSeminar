/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида 
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Scanner scan = new Scanner(System.in);
        boolean work = true;
        while (work){
            String line = scan.nextLine();
            String[] parts = line.split("~");
            String text = parts[0];
            String strNum = parts[1];
            int num = Integer.parseInt(strNum);
            switch (text){
                case "print":
                    System.out.println(list.remove(num));
                    break;
                case "finish":
                    work = false;
                    break;
                default:
                    list.add(num, text);
            }
        }
    }
}
