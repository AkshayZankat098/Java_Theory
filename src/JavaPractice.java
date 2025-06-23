import java.util.Scanner;

public class JavaPractice {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        JavaPractice java = new JavaPractice();
        java.ValidPalindrome();
    }

    public void ValidPalindrome (){

        String StringName = sc.nextLine();
        String StringLower = StringName.toLowerCase();

        // Reverse the string
        String StringName_Reversed = new StringBuilder(StringLower).reverse().toString();

        // Compare original and reversed
        if (StringLower.equals(StringName_Reversed)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public void StringCompression (){

    }
}
