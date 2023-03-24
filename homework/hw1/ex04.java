import java.util.Scanner;

// *(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69 (пользователь).
// Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
// под знаками вопроса - одинаковые цифра
// Ввод: 2? + ?5 = 69
// Вывод: 24 + 45 = 69

public class ex04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите выражение:");
        String examp = sc.nextLine().strip().replace(" ", "");
        String[] examp_arr = examp.split("=");
        String new_ex = "";
        int count_ex = 0;

        for (int i = 0; i < 10; i++) {
            String i_str = Integer.toString(i);
            new_ex = examp_arr[0].replace("?", i_str);
            String[] new_ex_arr = new_ex.split("\\+");
            int q = Integer.parseInt(new_ex_arr[0]);
            int w = Integer.parseInt(new_ex_arr[1]);
            int e = Integer.parseInt(examp_arr[1]);
            if (q + w == e) {
                System.out.printf("%d + %d = %d", q, w, e);
                count_ex++;
            }
        }  

        if (count_ex == 0){
            System.out.println("Решений нет.");
        }

        sc.close();
    }
}
