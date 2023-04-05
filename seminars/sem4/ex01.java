import java.util.ArrayList;
import java.util.LinkedList;

// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. 
// Сравните с предыдущим.

public class ex01 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        long startA = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            arrList.add(0, i);
        }
        long stopA = System.currentTimeMillis();
        System.out.println(stopA - startA);

        LinkedList<Integer> linkedLst = new LinkedList<>();
        long startB = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            linkedLst.add(0, i);
        }
        long stopB = System.currentTimeMillis();
        System.out.println(stopB - startB);
    }
}