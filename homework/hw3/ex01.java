import java.util.Arrays;
import java.util.Random;

/**
(Дополнительное) Реализовать алгоритм сортировки слиянием
 */

public class ex01 {
    public static void main(String[] args) {
        
        // новый рандомный массив
        int[] listNumbers = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            listNumbers[i] = rand.nextInt(0, 100);
        }

        System.out.println(Arrays.toString(listNumbers));
        SortUnsorted(listNumbers, 0, listNumbers.length - 1);
        System.out.println(Arrays.toString(listNumbers));

    }

    // Метод сортировки слиянием
    static void SortUnsorted(int[] a, int lo, int hi) {

        // условие выхода
        if (hi <= lo)
            return;
        // каждый раз ищем середину массива, чтобы разбить на подмассивы
        int mid = lo + (hi - lo) / 2;
        // пока не выполнено условие выхода из функции, вызываем ее снова,
        // разбивая на подмассивы снова и снова
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);
        
        // буфер для хранения
        int[] buf = Arrays.copyOf(a, a.length);
    
        for (int k = lo; k <= hi; k++)
            buf[k] = a[k];
        
        // обозначаем начало каждого подмассива
        int i = lo, j = mid + 1;
        // сравниваем элементы подмассивов и сортируем
        for (int k = lo; k <= hi; k++) {
    
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}