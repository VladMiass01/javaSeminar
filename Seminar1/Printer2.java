/*
Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке
от 1 до 1000, каждое на новой строке.
Напишите свой код в методе printPrimeNums класса Answer.
*/

class Answer {
    public void printPrimeNums() {
        for(int i = 1; i <= 1001; i++) {
            boolean k = false;
            for(int j = 2; j * j <= i; j++) {
                k = (i % j == 0);
                if(k) break;
            }
            if (!k) System.out.println(i);
        }
        return;
    }
}

public class Printer2 {
    public static void main(String[] args) {    
        Answer ans = new Answer();
        ans.printPrimeNums();
    }
}
