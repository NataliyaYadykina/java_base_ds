// Вывести все простые числа от 1 до 1000

public class ex02 {
    public static void main(String[] args) {
        
        int number = 1000;
        
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        for (int i = 5; i <= number; i += 2) {
            int count = 0;
            int div = 3;
            while (count < 1 && div < i){
                if (i % div == 0){
                    count++;
                    div += 2;
                } else {
                    div += 2;
                }
            }
            // for (int j = 2; j < i; j++) {
                
            //     if (i % j == 0 & j != i){
            //         count++;
            //     }
            // }
            if (count == 0){
                System.out.println(i);
            }
        }
    }
}
