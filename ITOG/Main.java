/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии)
фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры
фильтрации можно также в Map.
Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
Работу сдать как обычно ссылкой на гит репозиторий
Частые ошибки:
1. Заставляете пользователя вводить все существующие критерии фильтрации
2. Невозможно использовать более одного критерия фильтрации одновременно
3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру,
   а не всем введенным пользователем
4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики
   ноутбуков или добавить еще ноутбук, то программа начинает работать некорректно
Загрузите задание на проверку до 16 окт., 22:00 +05:00 UTC
*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        Scanner console = new Scanner(System.in);
        int[] ozu = new int[]{2, 4, 8, 16};
        int[] hdd = new int[]{128, 256, 512, 1024};
        String[] os = new String[]{"NoOS", "Linux", "Windows"};
        String[] col = new String[]{"black", "green", "red", "white"};
//Создаю набор ноутбуков
        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            int ozu_nb = random.nextInt(0, 4);
            int hdd_nb = random.nextInt(0, 4);
            int os_nb = random.nextInt(0, 3);
            int col_nb = random.nextInt(0, 4);
            Notebook notebook = new Notebook();
            notebook.setVol_OZU(ozu[ozu_nb]);
            notebook.setVol_HDD(hdd[hdd_nb]);
            notebook.setOper_OS(os[os_nb]);
            notebook.setCol_Book(col[col_nb]);
            //System.out.println(notebook);
            notebooks.add(notebook);
        }
        int ozu_cons = 0;
        int hdd_cons = 0;
        int os_cons = 0;
        int col_cons = 0;
//Выбираю ноутбук
        boolean cycle = true;
        while (cycle) {
            printMenu();
            System.out.println("Ведите номер меню");
            int menunum = console.nextInt();
            switch (menunum) {
                case 1:
                    System.out.println("Выберите объем ОЗУ\n" +
                            "1 - 2 MB\n" +
                            "2 - 4 MB\n" +
                            "3 - 8 MB\n" +
                            "4 - 16 MB\n" +
                            "0 - Пропустить"
                    );
                    System.out.println("Ведите номер меню");
                    ozu_cons = console.nextInt();
                    break;
                case 2:
                    System.out.println("Выберите объем ЖД\n" +
                            "1 - 128 MB\n" +
                            "2 - 256 MB\n" +
                            "3 - 512 MB\n" +
                            "4 - 1024 MB\n" +
                            "0 - Пропустить"
                    );
                    System.out.println("Ведите номер меню");
                    hdd_cons = console.nextInt();
                    break;
                case 3:
                    System.out.println("Выберите операционную систему\n" +
                            "1 - без ОС\n" +
                            "2 - Linux\n" +
                            "3 - Windows\n" +
                            "0 - Пропустить"
                    );
                    System.out.println("Ведите номер меню");
                    os_cons = console.nextInt();
                    break;
                case 4:
                    System.out.println("Выберите цвет\n" +
                            "1 - black\n" +
                            "2 - green\n" +
                            "3 - red\n" +
                            "4 - white\n" +
                            "0 - Пропустить"
                    );
                    System.out.println("Ведите номер меню");
                    col_cons = console.nextInt();
                    break;
                case 5:
//Печать подходящих
                    for (Notebook notebook: notebooks) {
                        if ((ozu_cons != 0 && ozu[ozu_cons - 1] > notebook.getVol_OZU()) ||
                            (hdd_cons != 0 && hdd[hdd_cons - 1] > notebook.getVol_HDD()) ||
                            (os_cons != 0 && !os[os_cons - 1].equals(notebook.getOper_OS())) ||
                            (col_cons != 0 && !col[col_cons - 1].equals(notebook.getCol_Book()))) continue;
                        String res = notebook.toString();
                        System.out.println(res);
                    }
                    break;
                case 0:
                    cycle = false;
                    console.close();
                    break;
                default:
                    System.out.println("Вы ввели неверное значение. Попробуйте еще раз");
            }
        }
    }

    public static void printMenu() {
            System.out.println("Меню:\n" +
                    "1 - объем ОЗУ\n" +
                    "2 - Объем ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "5 - Показать выбранные\n" +
                    "0 - Выход"
            );
    }
}