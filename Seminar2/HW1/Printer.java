package HW1;
/*
Дана строка sql-запроса:
select * from students where "
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Пример данных для фильтрации приведены ниже в виде json-строки. Если значение null,
то параметр не должен попадать в запрос.
Пример:
{"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
Напишите свой код в методе answer класса Answer. Метод answer принимает на вход два параметра:
String QUERY - начало SQL-запроса
String PARAMS - JSON с параметрами
*/
class Answer {
    public static StringBuilder answer(String QUERY, String PARAMS) {
        StringBuilder res = new StringBuilder(QUERY);
        String task = PARAMS;
        String[] parts = task.split(",");
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].contains("null")) parts[i] = "0:0";
            parts[i] = parts[i].replace("\"", "");
            parts[i] = parts[i].replace("{", "");
            parts[i] = parts[i].replace("}", "");
            parts[i] = parts[i].replace(" ", "");
        }
        String arr [][] = new String[parts.length][2];
        for (int j = 0; j < arr.length; j++) {
            int flag = 0;
            String [] temp = parts[j].split(":");
            for (int k = 0; k < 2; k++) {
                arr [j][k] = temp[k];
                if (!arr[j][k].equals("0")) {
                    if (k == 0) res.append(arr[j][k] + "='");
                    else res.append(arr[j][k]);
                }
                else flag = 1;
            }
            if (j < arr.length -1) res.append("' and ");
            if (flag == 1) res.setLength(res.length() - 5);
        }
        return res;
    }
}

public class Printer {
    public static void main(String[] args) {
        String QUERY = "";
        String PARAMS = "";
        if (args.length == 0) {
            QUERY = "select * from students where ";
            PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";
        }
        else {
            QUERY = args[0];
            PARAMS = args[1];
        }
        Answer ans = new Answer();
        System.out.println(ans.answer(QUERY, PARAMS));
    }
}