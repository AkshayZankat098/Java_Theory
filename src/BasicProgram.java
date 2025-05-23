import java.util.Scanner;

public class BasicProgram {

    public static void main(String[] args) {
        
    }
        
//Given a number n. Add all the numbers from 1 to n.        
        public static void Program1 () {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

                int sum = 0;
                for (int i=0; i <= n; i++){
                    sum = sum + i;
                }

                System.out.println(sum);
        }

//You are given two numbers as input. You have to return the largest of the two numbers as output.    
        public static void Program2 () {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

                if(a>b && a>c){
                    System.out.println("Large number :" + a);
                } else if (b>a && b>c) {
                    System.out.println("Large number :" + b);
                }else {
                    System.out.println("Large number :" + c);
                }
        }

//Classify even and odd number.    
        public static void Program3 () {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

                if(a%2==0){
                    System.out.println("Number is even");
                }else {
                    System.out.println("Number is odd");
                }
        } 

//Find the reminder of the number.    
        public static void Program4 () {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(a%b);
        } 
    
}

    