import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level; 
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.io.IOException;

/**
Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
результат после каждой итерации запишите в лог-файл.
 */
public class ex01 {
    public static void main(String[] args) throws IOException {
        int[] arr = {2, 1, 0, 9, 4, 3, 3, 1, 0, 7};
        int temp = 0;

        Logger logs = Logger.getLogger(ex01.class.getName());
        String logsPath = "ex01_log.txt";
        FileHandler fh = new FileHandler(logsPath, true);
        logs.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        fh.setFormatter(formatter);

        for (int i = 0; i < arr.length - 1; ++i) {
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                logs.log(Level.INFO, Arrays.toString(arr));
            }
        }
        System.out.println(Arrays.toString(arr));
    }  
}