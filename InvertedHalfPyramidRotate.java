public class InvertedHalfPyramidRotate {

    public static void main(String[] args) {

        int n = 5;
        // Outer Loop
        for (int i = 1; i <= n; i++) {

            // inner Loop

            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // inner Loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }

}
