import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Дана строка (получение через обычный текстовый файл!!!)

"фамилия":"Иванов","оценка":"5","предмет":"Математика"
"фамилия":"Петрова","оценка":"4","предмет":"Информатика"

Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет].

Пример вывода в консоль:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */

public class ex02 {
    public static void main(String[] args) {
        
        String filePath = "ex02_src.txt";
        showStringsFromFile(filePath);
    }

    static void showStringsFromFile(String path) {

        try {
            FileInputStream fstream = new FileInputStream(path);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in,"UTF-8"));
            String line;
            while((line = br.readLine()) != null){
                String[] arr_el = line.split(",");
                StringBuilder res = new StringBuilder();
                res.append("Студент ".concat(arr_el[0].split(":")[1]))
                    .append(" получил оценку ".concat(arr_el[1].split(":")[1]))
                    .append(" по предмету ".concat(arr_el[2].split(":")[1]));
                System.out.println(res);
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Что-то пошло не так...");
        }
    }
}
