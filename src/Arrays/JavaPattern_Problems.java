package Arrays;

public class JavaPattern_Problems {

    public static void main(String[] args) {
        Pattern02();
    }

    public static void Pattern01() {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern02() {

        for (int i = 0; i <= 4; i++) {

            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern03() {

        for (int i = 0; i <= 4; i++) {

            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern04() {
        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void Pattern05() {

        for (int i = 4; i >= 0; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void Pattern06() {

        int a = 65;

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (a + j));
            }

            System.out.println();
        }
    }

    public static void Pattern07() {

        int a = 65;

        for (int i = 0; i <= 4; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print((char) (a + i));
            }

            System.out.println();
        }
    }

    public static void Pattern08() {

        for (int i = 0; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Pattern09() {

        for (int i = 0; i <= 4; i++) {

            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 4; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void Pattern10() {

        int number = 1;

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    public static void Pattern11() {

        for (int i = 0; i <= 4; i++) {

            for (int k = 3; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 4; i++) {

            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }

            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void Pattern12() {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i <= 4; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void Pattern13() {

        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
