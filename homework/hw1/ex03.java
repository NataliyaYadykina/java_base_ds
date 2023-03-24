import java.util.Scanner;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

public class ex03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите знак/оператор для вычисления: ");
        String action = sc.next();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        int result = 0;

        switch(action){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            default:
                System.out.println("Входные данные некорректны, попробуйте снова.");
                break;
        }

        System.out.printf("%d %s %d = %d", num1, action, num2, result);

        sc.close();
    }
}
