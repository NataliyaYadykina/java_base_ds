import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
// import java.util.Stack;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, 
чтобы последняя введенная была первой в списке, а первая - последней.
asd
zxc
qwe
print
qwe
zxc
asd
[]
 */

public class ex03 {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        String str = "";
        boolean flag = true;

        while (flag) {
            System.out.println("Enter the string:");
            str = sc.nextLine();

            if (str.equals("print")) {
                // for (int i = dq.size() - 1; i >= 0 ; i--) {
                //     System.out.println(dq.removeLast());
                // }
                while(!dq.isEmpty()){
                    System.out.println(dq.removeLast());
                }
                flag = false;
            } else {
                dq.addLast(str);
            }
            System.out.println(dq);
        }
        sc.close();



        // Stack<String> stack = new Stack<>();
        // Scanner scanner = new Scanner(System.in);
        // String s = scanner.nextLine();

        // while (!s.equals("stop")){
        //     switch (s){
        //         case "print":
        //             while (!stack.empty()){
        //                 System.out.println(stack.pop());
        //             }
        //             break;
        //         default:
        //             stack.push(s);
        //     }
        //     s = scanner.nextLine();
        // }
        // scanner.close();
    }
}
