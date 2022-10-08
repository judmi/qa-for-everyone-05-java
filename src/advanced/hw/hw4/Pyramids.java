package advanced.hw.hw4;

public class Pyramids {

    public static void main(String[] args) {
        descendingPyramid();
        ascendingPyramid();
        pyramid();

    }

    public static void descendingPyramid(){

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void ascendingPyramid(){

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 9 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void pyramid() {
        for (int i = 9; i >= 0; i--) {
            for (int k = 0; k <= 9 - i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            for (int n = 1; n <= i; n++) {
                System.out.print(n + " ");
            }

            System.out.println();
        }
    }
}
