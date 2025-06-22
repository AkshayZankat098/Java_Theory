public class JavaPractice {


    public static void main(String[] args) {

        int[][] Ak2 = {{30, 20, 10}, {20, 30, 50}};

        System.out.println("Total rows: " + Ak2[2].length);

        for (int i = 0; i < Ak2.length; i++) {
            for (int j = 0; j < Ak2[i].length; j++) {
                System.out.print(Ak2[i][j] + " ");
            }
        }
    }
}
