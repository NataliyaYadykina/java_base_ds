import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Добавить функции: 1) Добавление номера; 2) Вывод всего
Пример:
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 1242353
К: Введите 1) Добавление номера
2) Вывод всего
Я ввожу: 1
К: Введите фамилию
Я: Иванов
К: Введите номер
Я: 547568
К: Введите 1) Добавление номера
2) Вывод всего
Я: 2
Иванов: 1242353, 547568
 */

public class ex01 {
    public static void main(String[] args) {
        Map<String, ArrayList<String>> pb = new HashMap<>();
        Scanner sc = new Scanner(System.in, "cp866");
        boolean flag = true;
        while(flag) {
            String action = getAction(sc);
            System.out.println(action);
            switch (action) {
                case "1":
                    addContact(pb, sc);
                    break;
                case "2":
                    showContacts(pb);
                    break;
                case "3":
                    System.out.println("Работа с телефонной книгой завершена.");
                    flag = false;
                    break;
                default:
                    System.out.println("Введены некорректные данные!" + action);
                    break;
            }
        }
    }

    static String getAction(Scanner sc){
        System.out.println("1. Добавить номер\n2. Просмотреть контакты\n3. Завершить работу\nВведите номер действия:");
        String action = sc.nextLine();
        return action;
    }

    static Map<String, ArrayList<String>> addContact(Map<String, ArrayList<String>> pb, Scanner sc) {
        System.out.println("Введите фамилию:");
        String name = sc.nextLine();
        System.out.println("Введите номер:");
        String phone = sc.nextLine();
        if (pb.containsKey(name)) {
            pb.get(name).add(phone);
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            pb.put(name, phones);
        }
        System.out.println("Контакт успешно добавлен!");
        return pb;
    }

    static void showContacts(Map<String, ArrayList<String>> pb) {
        if(!pb.keySet().isEmpty()){
            for (var item : pb.entrySet()){
                System.out.print(item.getKey() + ": ");
                for (String phones : item.getValue()) {
                    System.out.print(phones + ", ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.println("Телефонная книга пуста.");
        }
    }
}