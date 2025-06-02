
import java.util.Arrays;
import java.util.Scanner;

public class ArraysProblem {

    public static void main(String[] args) {
        ShortingInt1();
    }

    //Search an element in the given arrays >> Defination of LinearSearch : "We can search with one by one element via loop either for or for each loop"   
    public static void LinearSearch1() {
        int a[] = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);
        int SearchElement = sc.nextInt();
        boolean status = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == SearchElement) {
                System.out.println("Element Found");
                status = true;
                break;
            }
        }
        if (status == false) {
            System.out.println("Element Not Found");
        }
    }

    public static void LinearSearch2() {
        int b[] = {20, 10, 20, 70, 20, 80, 90, 100};

        Scanner sc = new Scanner(System.in);
        int SearchElement = sc.nextInt();

        int TotalCount = 0;

        for (int i = 0; i < b.length; i++) {
            if (b[i] == SearchElement) {
                TotalCount = TotalCount + 1;
            }
        }

        System.out.println(TotalCount);

        if (TotalCount == 0) {
            System.out.println("Element not found");
        }
    }

    public static void ShortingInt1() {

        int a[] = {10, 30, 15, 60, 80, 75, 35};

        System.out.println("Before Short" + Arrays.toString(a)); //Arrays.toString(a) : method is used to return a string representation, It converts the array into a readable format that can be easily displayed or printed
        Arrays.sort(a);
        System.out.println("After Short" + Arrays.toString(a));
    }

    public static void ShortingString2() {

        String a[] = {"M", "Z", "C", "A", "B", "E", "O"};

        System.out.println("Before Short" + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("After Short" + Arrays.toString(a));
    }

    public static void TakeArrayFromConsolve() {

        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

//Arrays Problem1 : Reverse the arrays 
    public static void ReverseArrays() {

        // int a[] = {10, 30, 15, 60, 80, 75, 35};
        String a[] = {"M", "Z", "C", "A", "B", "E", "O"};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

//Arrays Problem2 : Find the smallest & biggest number in arrays
    public static void SmallNumArrays() {

        int a[] = {10, 20, 8, 7, 6, 80};

        int smallnum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < smallnum) {
                smallnum = a[i];
            }
        }
        System.out.println("Small number in array is : " + smallnum);

    }

    public static void BigNumArrays() {

        int a[] = {10, 20, 8, 7, 6, 80};

        int Bignum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > Bignum) {
                Bignum = a[i];
            }
        }
        System.out.println("Big number in array is : " + Bignum);

    }

//Arrays Problem3 : Check if the given array is in non decreasing order
    public static void NonDecreasing() {
        int a[] = {10, 20, 30, 40, 50, 60};

        String result = "Not in non decreasing order";
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                result = "In non decreasing order";
                break;  //Exit the loop as soon as we detect a violation
            }
        }
        System.out.println(result);
    }

//Arrays Problem4 : Find the total number of student present in class or sum 2dArrays
    public static void Sum2DArray() {
        int a[][] = {{10, 20, 30}, {40, 50, 60}};

        int TotalStudent = 0;

        for (int r = 0; r < a.length; r++) {
            for (int c = 0; c < a[r].length; c++) {
                TotalStudent = TotalStudent + a[r][c];
            }
        }
        System.out.println(TotalStudent);
    }

//Arrays problem5 : Find the center of the given matrix
    public static void findCenter() {

        //int a[][] = {{10, 20, 30, 40, 50, 60, 80, 30, 5}, {10, 20, 30, 40, 50, 60, 80, 30, 5}, {10, 20, 30, 40, 50, 60, 80, 30, 5}, {10, 20, 30, 40, 50, 60, 80, 30, 5}, {10, 20, 30, 40, 36, 60, 80, 30, 5}, {10, 20, 30, 40, 21, 60, 80, 30, 5}, {10, 20, 30, 40, 50, 60, 80, 30, 5}, {10, 20, 30, 40, 50, 60, 80, 30, 5}, {10, 20, 30, 40, 50, 60, 80, 30, 5}}; 
        int a[][] = {{10, 20, 30}, {40, 50, 60}, {40, 50, 60}};

        // Check if the matrix is non-empty
        if (a == null || a.length == 0 || a[0].length == 0) {
            System.out.println("Center not present");  // No matrix or empty matrix
        }

        int rows = a.length;
        int cols = a[0].length;
        System.out.println("Number of rows present is : " + rows);
        System.out.println("Number of colums present is : " + cols);

        //Check if both the number of rows and columns are odd (1,3,5..)
        if (rows % 2 == 1 && cols % 2 == 1) {
            int centerRow = rows / 2;  //Give us quotient as a output 
            int centerCol = cols / 2;
            System.out.println(a[centerRow][centerCol]);
        } else {
            System.out.println("Center is not present"); // If the number of rows or columns is even(2,4,6..), return null
        }
    }

//Arrays problem6 : Determine the matrix T sum
    public static void MatrixTsum() {

        int a[][] = {{10, 20, 30}, {40, 50, 60}, {40, 50, 60}};

        int Totalsum1 = 0;
        int Totalsum2 = 0;
        int Totalsum3 = 0;

        for (int i = 0; i < a.length; i++) {
            Totalsum1 = Totalsum1 + a[0][i];
        }

        Totalsum2 = Totalsum2 + a[(a.length / 2)][(a[0].length / 2)];

        Totalsum3 = Totalsum3 + a[2][1];

        System.out.println(Totalsum1);
        System.out.println(Totalsum2);
        System.out.println(Totalsum3);

        System.out.println(Totalsum1 + Totalsum2 + Totalsum3);

    }

//Given a number n. Add all the numbers from 1 to n.        
    public static void Program1() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }

//You are given two numbers as input. You have to return the largest of the two numbers as output.    
    public static void Program2() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Large number :" + a);
        } else if (b > a && b > c) {
            System.out.println("Large number :" + b);
        } else {
            System.out.println("Large number :" + c);
        }
    }

//Classify even and odd number.    
    public static void Program3() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }

//Find the reminder of the number.    
    public static void Program4() {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a % b);
    }

}
