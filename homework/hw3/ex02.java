import java.util.ArrayList;
import java.util.Random;

/*
Пусть дан произвольный список целых чисел, удалить из него чётные числа
*/

public class ex02 {
    public static void main(String[] args) {
        
        ArrayList<Integer> listNumbers = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listNumbers.add(rand.nextInt(0, 100));
        }

        System.out.println(listNumbers);

        for (int i = listNumbers.size() - 1; i >= 0; i--) {
            if (listNumbers.get(i) % 2 == 0) {
                listNumbers.remove(i);
            }
        }

        System.out.println(listNumbers);

    }
}
