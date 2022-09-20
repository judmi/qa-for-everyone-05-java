/*
Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.
 */

package advanced.hw.hw2;

public class PowersOfFive {
    public static void main(String[] args) {
        int result = 1;

        for (int i = 1; result * 5 < 1000; i++) {
            result *= 5;
            System.out.println("five raised to the power of " + i + " is " + result);
        }
    }
}