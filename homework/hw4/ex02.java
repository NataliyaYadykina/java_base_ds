import java.util.LinkedList;
import java.util.Random;

/*
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди,
dequeue() - возвращает первый элемент из очереди и удаляет его,
first() - возвращает первый элемент из очереди, не удаляя.
 */

public class ex02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        int length = 10;
        list = randomList(list, length);
        System.out.println("Исходный список: " + list);
        enqueue(list, 1);
        System.out.println("Поместили элемент с индексом 1 в конец очереди:");
        System.out.println(list);
        System.out.println("Удалили первый элемент из очереди: " + dequeue(list));
        System.out.println(list);
        System.out.println("Теперь первый элемент в очереди: " + first(list));
    }

    static LinkedList<Integer> randomList(LinkedList<Integer> list, Integer length) {
        Random rand = new Random();
        for (int i = 1; i < length; i++) {
            list.add(rand.nextInt(0, 100));
        }
        return list;
    }

    // Помещаем имеющийся элемент (по его индексу, второй параметр) в конец очереди
    static void enqueue(LinkedList<Integer> list, Integer indexEl) {
        list.addLast(list.get(indexEl));
        list.remove(list.get(indexEl));
    }

    // возвращает первый элемент из очереди и удаляет его
    static Integer dequeue(LinkedList<Integer> list) {
        int firstEl = list.removeFirst();
        return firstEl;
    }

    // возвращает первый элемент из очереди, не удаляя.
    static Integer first(LinkedList<Integer> list) {
        return list.getFirst();
    }
}
