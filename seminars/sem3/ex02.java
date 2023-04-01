import java.util.ArrayList;
import java.util.Random;

/*
 * Заполнить список названиями планет Солнечной системы
 * в произвольном порядке с повторениями.
 * Вывести название каждой планеты 
 * и количество его повторений в списке.
 */

public class ex02 {
    public static void main(String[] args) {
        Random random = new Random();
        String[] origin = {"Mercury", "Earth", "Neptune", "Venus", "Mars", "Jupiter", "Saturn", "Uranus"};
        ArrayList<String> planets = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            planets.add(origin[random.nextInt(origin.length - 1)]);
        }

        planets.sort(null);
        System.out.println(planets);
        int count = 1;
        for (int i = 1; i < planets.size(); i++) {
            if (planets.get(i) == planets.get(i - 1)) {
                count++;
            } else {
                System.out.printf("%s - %d\n", planets.get(i - 1), count);
                count = 1;
            }
        }
        System.out.printf("%s - %d", planets.get(planets.size() - 1), count);
    }
}
