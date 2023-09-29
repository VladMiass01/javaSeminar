/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n).
Внутри класса Answer напишите метод countNTriangle,
который принимает число n и возвращает его n-ое треугольное число.
Пример
n = 4 -> 10
n = 5 -> 15
*/

class Answer {
    public int countNTriangle(int n) {
        return n * (n + 1) / 2;
    }
}

public class Printer1 {
    public static void main(String[] args) { 
        int n = 0;
        if (args.length == 0) {
            n = 4;
        }
        else {
            n = Integer.parseInt(args[0]);
        }
        Answer ans = new Answer(); 
        int itresume_res = ans.countNTriangle(n);     
        System.out.println(itresume_res);
    }
}