import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level; 
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

/*
*дополнительно. К калькулятору из предыдущего дз добавить логирование.
1 + 3 = 4
4 + 3 = 7
 */

 public class ex03 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите знак/оператор для вычисления: ");
        String action = sc.next();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        sc.close();
        int result = 0;

        Logger logs = Logger.getLogger(ex01.class.getName());
        String logsPath = "ex03_log.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        logs.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

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

        StringBuilder res = new StringBuilder();
        res.append(Integer.toString(num1).concat(" ")
                    .concat(action).concat(" ")
                    .concat(Integer.toString(num2)).concat(" = ")
                    .concat(Integer.toString(result)));

        logs.log(Level.INFO, res.toString());  
    }
}