/*
В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди
dequeue() - возвращает первый элемент из очереди и удаляет его
first() - возвращает первый элемент из очереди, не удаляя
getElements() - возвращает все элементы в очереди
Пример
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements()); 
// [1, 10, 15, 5]
queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
// [15, 5]
System.out.println(queue.first());
// 15
*/
import java.util.LinkedList;

class MyQueue<T> {
    public LinkedList<T> list = new LinkedList<>();
    public void enqueue(T element) {
        list.add(element);
    }
    public T dequeue() {
        return list.removeFirst();
    }
    public T first() {
        return list.peek();
    }
    public LinkedList<T> getElements() {
        return list;
    }
}

public class Printer2 {
    public static void main(String[] args) {
        MyQueue<Integer> queue;
        queue = new MyQueue<>();
        if (args.length == 0) {
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } 
        else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}