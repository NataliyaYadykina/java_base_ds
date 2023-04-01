import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(rand.nextInt(0, 100));
        }

        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
