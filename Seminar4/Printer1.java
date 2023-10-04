/*
Пусть дан LinkedList с несколькими элементами.
Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList
и возвращает “перевернутый” список.
Пример
// Дан 
[1, One, 2, Two]
// Вывод
[1, One, 2, Two]
[Two, 2, One, 1]
*/
import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> res = new LinkedList<>();
        for (Object i : ll) {
            res.add(0, i);
        }
        return res;
    }
}

public class Printer1 { 
    public static void main(String[] args) { 
        LinkedList<Object> ll = new LinkedList<>();
        if (args.length == 0 || args.length != 4) {
            ll.add(1);
            ll.add("One");
            ll.add(2);
            ll.add("Two");
            ll.add(3);
            ll.add("Thre");
        } 
        else {
            ll.add(Integer.parseInt(args[0]));
            ll.add(args[1]);
            ll.add(Integer.parseInt(args[2]));
            ll.add(args[3]);
            ll.add(Integer.parseInt(args[4]));
            ll.add(args[5]);
        }
        LLTasks answer = new LLTasks();
        System.out.println(ll);
        LinkedList<Object> reversedList = answer.revert(ll);
        System.out.println(reversedList);
    }
}