/*
list - ссылочный тип данных, передается ссылка, массивы передаются поссылкам
a - примитив, передается значение
*/
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int a = 5;
        a = test(list, a);
        System.out.println(list);
        System.out.println(a);
    }

    static int test(List<Integer> list, int a) {
        list.add(1);
        a++;
        return a;
    }
}
