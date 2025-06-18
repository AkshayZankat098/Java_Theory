package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Array_theory {

    public static void main(String[] args) {
        TwoDimensional();
    }

    public static void OneDimensional() {

//-----------List of all properties of Arrays-----------
//1) Defination : Collection of the value with same datatype 
//2) Data store in index format 
//3) Array is one type of data types and we can assign veriable into this 
//4) Only we can store homogenius data inside this & if want to store diff types of data we need to define 
//Object[]: This is an array of Object, which can store elements of any type, such as String, Integer, Boolean, etc., because all classes in Java inherit from the Object class. 
//ex :  Object e [] = {"test", 10};
//5) Two types of arrays : One-Dimensional Arrays (1D Arrays) & Two-Dimensional Arrays (2D Arrays)

//-----------One-Dimensional Arrays (1D Arrays)-----------
        int a[] = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

//-----------The ways of adding data inside arrays-----------   
//1) Using Arrays.fill() Method
//2) Using a Loop
        for (int i = 0; i < a.length; i++) {
            a[i] = i * 10;  // For example, assigning multiples of 10
        }

//3) Using an Initializer List            
        int b[] = {10, 20, 30, 40, 50};

//4)  Using System.arraycopy()
// Copy elements from array b to array a
        System.arraycopy(b, 0, a, 0, b.length);

//5) Using a List and Converting to an Array
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        int[] c = list.stream().mapToInt(i -> i).toArray();  // Convert List to Array

//-----------iterate or get data over an array-----------
//1) Using for loop
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

//2) Using for each loop
        for (int x : b) {
            System.out.println(x);
        }
    }

//-----------Two-Dimensional Arrays (2D Arrays)-----------
    public static void TwoDimensional() {

//1) Decleration of two-diamention arrays with define fix size of arrays
        int d[][] = new int[3][3];

        d[0][0] = 100;
        d[0][1] = 200;
        d[0][2] = 300;
        d[1][0] = 400;
        d[1][1] = 500;
        d[1][2] = 600;
        d[2][0] = 700;
        d[2][1] = 800;
        d[2][2] = 900;

//2) Using an Initializer List
        int e[][] = {{100, 200, 300}, {400, 500, 600}, {700, 800, 900}};

//-----------iterate or get data over an array-----------
//1) Using for each loop
        for (int[] rows : e) {                 // Enhanced for loop to iterate over the rows
            for (int colum : rows) {           // Loop through each element in the row and print it
                System.out.print(colum + " "); // Print the elements of each row
            }
            System.out.println();              // Move to the next line after each row
        }

//2) Print the 2D array using nested loops
        System.out.println(d.length);      //Give me the total number of rows present in the arrays

        System.out.println(d[0].length);   //Give me the total number of columns present in the arrays means present in d[0] rows

        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " "); // Print elements of each row
            }
            System.out.println();               // Move to the next line after each row
        }
    }
}
