import java.util.ArrayList;
import java.util.Random;

/*
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. 
И вывести Доску. Пример вывода доски 8x8
0x000000
0000x000
00x00000
 */

public class chess {
    public static void main(String[] args) {
        int countChess = 8;
        int rows = 8;
        ArrayList<String> cells = indexCellsBoard(rows);
        showBoard(fillBoard(cells, rows, countChess), rows);
    }

    // Создаем массив ячеек для доски, заполняя ячейки строками вида ij,
    // где i - номер строки, j - номер столбца
    static ArrayList<String> indexCellsBoard(int rows){
        ArrayList<String> cells = new ArrayList<>(rows ^ 2);
        String str = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                str = Integer.toString(i) + Integer.toString(j);
                cells.add(str);
            }
        }
        return cells;
    }

    // Расставляем ферзей в ячейки, используя временный вспомогательный массив - копия исходного массива с ячейками
    static ArrayList<String> fillBoard(ArrayList<String> cells, int rows, int count) {
        ArrayList<String> tempCells = new ArrayList<>(cells);
        Random rand = new Random();
        int countSucces = 0;
        // Заполнять будем снова и снова до победного,
        // ориентируясь на размер временного массива ячеек и количество успешно поставленных ферзей
        // (будем удалять из него ячейки, в которые нельзя поставить ферзя, учитывая уже расставленные)
        while (tempCells.size() > 0) {
            // Берем рандомную ячейку из временного массива ячеек или последнюю, 
            // если в результате работы цикла осталась одна ячейка
            int rnd;
            if (tempCells.size() == 1) {
                rnd = 0;
            } else {
                rnd = rand.nextInt(tempCells.size() - 1);
            }
            String cell = tempCells.get(rnd);
            int row = cell.charAt(0) - '0';
            int col = cell.charAt(1) - '0';
            // Удаляем все ячейки строки и столбца выбранной ячейки
            // Также удаляем ячейки, куда нельзя будет ставить след.ферзей, из диагоналей
            // Ориентируясь на содержимое ячеек вида ij
            // В исходном массиве ячеек в выбранную ячейку ставим Х
            // Считаем количество успешно поставленных ферзей
            for (int i = tempCells.size() - 1; i >= 0; i--) {
                if (tempCells.get(i).charAt(0) == cell.charAt(0)
                    || tempCells.get(i).charAt(1) == cell.charAt(1)
                    || Math.abs(tempCells.get(i).charAt(0) - '0' - row) 
                    == Math.abs(tempCells.get(i).charAt(1) - '0' - col)
                    ) {
                        tempCells.remove(i);
                    }
                }
                if (cells.indexOf(cell) != -1){
                    cells.set(cells.indexOf(cell), "X");
                    countSucces++;
                }
                if (tempCells.size() == 1) {
                    cells.set(cells.indexOf(tempCells.get(0)), "X");
                    countSucces++;
                }
                // Если пробежали по всему временному массиву ячеек, а количество успешно поставленных ферзей < 8
                // Обновляем массивы на исходное состояние и обнуляем счетчик поставленных ферзей
                // Начинаем цикл while сначала
                if (tempCells.size() <= 1 && countSucces < count) {
                    cells = new ArrayList<>(indexCellsBoard(rows));
                    tempCells = new ArrayList<>(indexCellsBoard(rows));
                    countSucces = 0;
                }
        }
        return cells;
    }

    static void showBoard(ArrayList<String> cells, int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = i * rows; j < i * rows + rows; j++) {
                if (cells.get(j).equals("X")) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" " + 0 + " ");
                }
            }
            System.out.print("\n");
        }
    }
}
