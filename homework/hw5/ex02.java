import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
 */

public class ex02 {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>(Arrays.asList (
            "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
            "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
            "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
            "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов"));
        Map<String, Integer> names = dictNames(people);
        sortNames(names);
    }

    // Создание Map имен (ключи) с их количеством (значения)
    static Map<String, Integer> dictNames(List<String> list){
        Map<String, Integer> names = new HashMap<>();
        list.sort(Comparator.naturalOrder());
        int count = 1;
        for (int i = 1; i < list.size(); i++) {
            if(list.get(i).split(" ")[0].equals(list.get(i - 1).split(" ")[0])) {
                count++;
            } else {
                names.put(list.get(i - 1).split(" ")[0], count);
                // System.out.println(list.get(i - 1).split(" ")[0] + ": " + count);
                count = 1;
            }
        }
        names.put(list.get(list.size() - 1).split(" ")[0], count);
        // System.out.println(list.get(list.size() - 1).split(" ")[0] + ": " + count);
        return names;
    }

    // Сортировка популярных имен с помощью отсортированного по убыванию множества значений Map
    static void sortNames(Map<String, Integer> names){
        List<Integer> list = new ArrayList<>(names.values());
        Map<String, Integer> namesTemp = new HashMap<>(names);
        list.sort(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            for (var item : namesTemp.entrySet()) {
                if (item.getValue() == list.get(i)) {
                    System.out.println(item.getKey() + ": " + item.getValue());
                    namesTemp.remove(item.getKey());
                    break;
                }
            }
        }
    }
}
