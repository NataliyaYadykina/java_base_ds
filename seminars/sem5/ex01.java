import java.util.HashMap;
import java.util.Map;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.

public class ex01 {
    public static void main(String[] args) {
        
        Map<Integer, String> passports = new HashMap<>();
        
        passports.put(123456, "Иванов");
        passports.put(321456, "Васильев");
        passports.put(234561, "Петрова");
        passports.put(234432, "Иванов");
        passports.put(654321, "Петрова");
        passports.put(345678, "Иванов");

        for (var kv : passports.entrySet()){
            if (kv.getValue().equals("Иванов")) {
                System.out.println(kv.getKey() + " " + kv.getValue());
            }
        }
    }
}