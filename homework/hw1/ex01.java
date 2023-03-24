import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class ex01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число n: ");
        int number = Math.abs(sc.nextInt());
        int sum = 0;
        int multi = 1;

        for (int i = 1; i <= number; i++) {
            sum += i;
            multi *= i;
        }

        System.out.printf("Треугольное число = %d, n! = %d", sum, multi);

        sc.close();

    }
    
}