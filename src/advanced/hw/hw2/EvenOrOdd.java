/*
Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
 */

package advanced.hw.hw2;

public class EvenOrOdd {
    public static void main(String[] args) {
        int a = 28;
        int b = 91;

        if ((a + b) % 2 == 0) {
            System.out.println("Maybe a and b are even");
        } else {
            System.out.println("Some variable is odd");
        }
    }
}
