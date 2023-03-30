import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. 
// Написать метод, который вернет строку длины N,
// которая состоит из чередующихся символов c1 и c2, начиная с c1.
// 6
// a b
// ababab

public class ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("int number: ");
        int number = sc.nextInt();
        System.out.println("int fist char: ");
        String firstChar = sc.next();
        System.out.println("int second char: ");
        String secondChar = sc.next();
        sc.close();

        System.out.println(str(number, firstChar, secondChar));
    }

    static String str(int number, String firstChar, String secondChar) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number / 2; i++) {
            result.append(firstChar).append(secondChar);
        }
        return result.toString();
    }
}
