// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.


public class ex01 {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 0, 1, 1, 1};
        int count_nums = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                count_nums++;
            }
            if(arr[i] == 0 && count_nums > result || i == arr.length - 1){
                result = count_nums;
                count_nums = 0;
            }
        }
        System.out.println(result);
    }
}
