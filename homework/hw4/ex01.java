import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

public class ex01 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(randomList(list, 10));
        System.out.println(reverseList(list));
    }

    static LinkedList<Integer> randomList(LinkedList<Integer> list, Integer length) {
        Random rand = new Random();
        for (int i = 1; i < length; i++) {
            list.add(rand.nextInt(0, 100));
        }
        return list;
    }

    static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        LinkedList<Integer> result = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(list.size() - 1 - i));
        }
        return result;
    }
}