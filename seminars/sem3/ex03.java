import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class ex03 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>(
                Arrays.asList("Mercury", 3, "Earth", "Mars", 1, 7, "Jupiter", "Saturn", 45));
        Iterator<Object> iterator = list.iterator();

        while (iterator.hasNext())
        if (iterator.next() instanceof Integer)
        iterator.remove();

        System.out.println(list);


        // ArrayList<String> newList = new ArrayList<>();
        // for (int i = 0; i < list.size(); i++)
        // if (list.get(i) instanceof String)
        // newList.add((String) (list.get(i)));

        // System.out.println(newList);


        // for (int i = list.size() - 1; i >= 0; i--) {
        // if (list.get(i) instanceof Integer) {
        // list.remove(i);
        // }
        // }
        // System.out.println(list);


        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) instanceof Integer) {
        //         list.remove(i);
        //         i--;
        //     }
        // }
        // System.out.println(list);
    }
}