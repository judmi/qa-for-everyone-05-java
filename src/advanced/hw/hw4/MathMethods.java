package advanced.hw.hw4;

public class MathMethods {

    public static void main(String[] args) {
        System.out.println(getSum(4, 9));
        System.out.println(getDifference(82, 12));
        System.out.println(getMultiplication(72, 91));
        System.out.println(getDivision(10, 3));
    }

    public static int getSum (int a, int b) {
        return a + b;
    }

    public static int getDifference (int a, int b) {
        return a - b;
    }

    public static int getMultiplication (int a, int b) {
        return a * b;
    }

    public static double getDivision (int a, int b) {
        return a * 1.0 / b;
    }
}
