import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в наш магазин!");

        Notebook notebook1 = new Notebook("Asus", "Windows", "black", 4, 500);
        Notebook notebook2 = new Notebook("Acer", "MacOS", "gray", 16, 1000);
        Notebook notebook3 = new Notebook("Dell", "Windows", "black", 4, 1000);
        Notebook notebook4 = new Notebook("Lenovo", "MacOS", "white", 32, 2000);
        Notebook notebook5 = new Notebook("Acer", "Windows", "gray", 16, 1000);
        Notebook notebook6 = new Notebook("Asus", "MacOS", "black", 8, 1000);
//        System.out.println(notebook6.displayInfo());

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);
        notebooks.add(notebook4);
        notebooks.add(notebook5);
        notebooks.add(notebook6);

        HashMap<Integer, String> filters = new HashMap<>();
        int filter = getFilter();
        filters.put(filter, getSubFilter(filter));
        filter(notebooks, filters);

    }

    public static int getFilter(){
        System.out.println("Какой ноутбук вы ищете?\n" +
                "Введите цифру для фильтра:\n" +
                "1. ОЗУ\n" +
                "2. Операционная система\n" +
                "3. Объем ЖД\n" +
                "4. Цвет:");
        return sc.nextInt();
    }

    public static String getSubFilter(int filter){
        String subFilter = "";
        switch (filter) {
            case 1:
                System.out.println("Укажите минимальный объем оперативной памяти:");
                break;
            case 2:
                System.out.println("Укажите операционную систему:");
                break;
            case 3:
                System.out.println("Укажите минимальный объем жесткого диска:");
                break;
            case 4:
                System.out.println("Укажите цвет:");
                break;
        }
        subFilter = sc.next();
        return subFilter;
    }

    public static void filter(List<Notebook> notebooks, HashMap<Integer, String> filters) {
        if (filters.containsKey(1)) {
            for (int i = 0; i < notebooks.size(); i++) {
                if(notebooks.get(i).getRam() >= Integer.parseInt(filters.get(1))) {
                    System.out.println(notebooks.get(i).displayInfo());
                }
            }
        }
        if (filters.containsKey(2)) {
            for (int i = 0; i < notebooks.size(); i++) {
                if(notebooks.get(i).getOs().toLowerCase().equals(filters.get(2).toLowerCase())) {
                    System.out.println(notebooks.get(i).displayInfo());
                }
            }
        }
        if (filters.containsKey(3)) {
            for (int i = 0; i < notebooks.size(); i++) {
                if(notebooks.get(i).getHd() >= Integer.parseInt(filters.get(3))) {
                    System.out.println(notebooks.get(i).displayInfo());
                }
            }
        }
        if (filters.containsKey(4)) {
            for (int i = 0; i < notebooks.size(); i++) {
                if(notebooks.get(i).getColor().toLowerCase().equals(filters.get(4).toLowerCase())) {
                    System.out.println(notebooks.get(i).displayInfo());
                }
            }
        }
    }

}