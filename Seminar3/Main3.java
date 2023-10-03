/*
Создать список типа ArrayList
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
*/

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(5);
        list.add(13);
        list.add(13);
        list.add("привет");
        list.add(3.14);
        list.add("4");
        System.out.println(list);
        removeIntegers2(list);
        System.out.println(list);
    }

    static void removeIntegers(List list) {
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
    }

    static void removeIntegers2(List list) {
        list.removeIf(obj -> obj instanceof Integer);
    }
}