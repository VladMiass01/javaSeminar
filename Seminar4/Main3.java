/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль
содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на
консоль содержимое очереди.
   1) Написать метод, который принимает массив элементов, помещает их в стэк
    и выводит на консоль содержимое стэка.
    2) Написать метод, который принимает массив элементов, помещает их в очередь
    и выводит на консоль содержимое очереди.
*/
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        String[] arr = new String[]{"1", "2", "3", "4"};
        testQueue(arr);
        testStack(arr);
    }

    static void testQueue(String[] arr){
        Queue<String> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(arr));
//        System.out.println(queue);
//        for (String s: queue){
//            System.out.println(s);
//        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
    static void testStack(String[] arr){
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
//        System.out.println(stack);
//        for (String s: stack){
//            System.out.println(s);
//        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
