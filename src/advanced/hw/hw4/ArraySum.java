/*
Дан массив:
int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
необходимо вывести сумму всех значений массива.

 */

package advanced.hw.hw4;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println(result);
    }
}
