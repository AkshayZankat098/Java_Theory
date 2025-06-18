package Oops_Concepts;

public class Polymorphism {

// Polymorphism :: Means "many forms."
// In Java, it allows one interface, method, or object to behave in different ways depending on context.    
// Why Use Polymorphism?
//1. Increases flexibility and reusability.
//2. Enables method overloading and overriding.
//3. Supports runtime decisions (dynamic binding).
//4. Helps in implementing interfaces and abstraction.
//5. What is interfaces ?
//6. What is abstraction ?
//7. Types of Polymorphism ?
//8. What is data abstraction ?
//9. What is an abstract class? 

// 1. Compile-Time Polymorphism or Static Polymorphism (Method Overloading)
// When multiple methods in the same class have the same name but different parameters.
    static int add(int a, int b) {
        return a + b;
    }

    static double add(double a, double b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

// 2. Runtime Polymorphism or Dynamic Polymorphism (Method Overriding)
// When a subclass provides a specific implementation of a method that is already defined in its superclass.
    void sound() {
        System.out.println("Animal makes sound");
    }

    public static void main(String[] args) {

        Polymorphism a = new Dog();     // Upcasting
        a.sound();                      // Dog's sound() called at runtime
        int sum = add(10, 20, 30);
        System.out.println(sum);
    }

}

//Subclass or child class 
class Dog extends Polymorphism {

    void sound() {
        System.out.println("Dog barks");
    }
}

