package advanced.hw.hw2;

public class ActionsWithVariables {
    public static void main(String[] args) {
        int a = 83;
        int b = 17;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a * 1.0 / b);
        System.out.println("a is even if the remainder of division by 2 equals 0. The result is: " + a % 2);
        System.out.println("b is even if the remainder of division by 2 equals 0. The result is: " + b % 2);
    }
}
