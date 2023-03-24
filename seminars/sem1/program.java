import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {
        String str = "Hello, world";
        System.out.println(str);
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        // String name = sc.next();
        System.out.println(age);
        System.out.println(name);
        sc.close();
    }
}