import java.util.ArrayList;
import java.util.Random;

/*
Задан целочисленный список ArrayList. 
Найти минимальное, максимальное и среднее ариф. из этого списка.
 */

public class ex03 {
    public static void main(String[] args) {
        
        ArrayList<Integer> listNumbers = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listNumbers.add(rand.nextInt(0, 100));
        }

        System.out.println(listNumbers);

        int min = listNumbers.get(0);
        int max = listNumbers.get(0);
        double sum = 0;
        double average = 0;

        for (int i = 0; i < listNumbers.size(); i++) {
            if (listNumbers.get(i) < min) {
                min = listNumbers.get(i);
            }
            if (listNumbers.get(i) > max) {
                max = listNumbers.get(i);
            }
            sum += listNumbers.get(i);
        }

        average = sum / listNumbers.size();

        System.out.printf("min = %d, max = %d, average = %.2f, sum = %.0f", min, max, average, sum);
    }

}
