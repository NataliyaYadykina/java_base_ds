import java.util.LinkedList;
import java.util.Scanner;

/*
В калькулятор добавьте возможность отменить последнюю операцию.
Пример
1
+
2
ответ:
3
+
4
ответ:
7
+
2
ответ:
9
1
Ответ 8
Отмена -> 9
Отмена -> 7
Отмена -> 3
+
2
Ответ 5
 */

public class ex03 {
    public static void main(String[] args) {
        
        String actions = "+,-,/,*,cancel";
        String action = "";
        int num = 0;
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> results = new LinkedList<>();

        System.out.println("Введите число: ");
        num = sc.nextInt();
        results.addLast(num);
        while (actions.contains(action) && results.size() > 0) {
            System.out.println("Введите +, -, /, * или cancel:");
            action = sc.next();
            if (!action.equals("cancel")) {
                System.out.println("Введите число: ");
                num = sc.nextInt();
            }
            switch(action){
                case "+":
                    results.addLast(results.getLast() + num);
                    break;
                case "-":
                    results.addLast(results.getLast() - num);
                    break;
                case "/":
                    results.addLast(results.getLast() / num);
                    break;
                case "*":
                    results.addLast(results.getLast() * num);
                    break;
                case "cancel":
                    results.removeLast();
                    if (results.size() > 0) {System.out.println(results.getLast());} 
                    break;
                default:
                    System.out.println("Входные данные некорректны, попробуйте снова.");
                    break;
            } 
            if (results.size() > 0) {System.out.println("Ответ: " + results.getLast());}
        }
        System.out.println("Работа завершена.");
        sc.close();
    }
}
