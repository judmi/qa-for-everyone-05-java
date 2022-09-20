/*
Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
 */

package advanced.hw.hw2;

public class VariableSearch {
    public static void main(String[] args) {
        int a = 73;

        if (a > 10) {
            System.out.println("a is greater than 10");
        }
        if (a < 100) {
            System.out.println("a is less than 100");
        }
        if (a / 2 > 20) {
            System.out.println("the result of division a by 2 is greater than 20");
        }
        if (a > 5 && a <= 40) {
            System.out.println("a is between 5 and 40 included");
        } else {
            System.out.println("a is less than 5 or greater than 40");
        }
    }
}
