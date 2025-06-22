package Oops_Concepts.Encapsulation;

public class Encapsulation01 {

//Only Class, variables and methods have the access modifies
// Encapsulation : Practice of bundling/Wrapping the data (variables) and the
    // methods (functions) in to a single unit.
    // called a class, and restricting access to some of the object's components.

    // Key Aspects of Encapsulation or achieve Encapsulation via below steps :
    // 1) Private Variables
    // 2) Public Methods (Getters and Setters)

    // Getters : allow reading the value of a private field.
    // Setters : allow modifying the value of a private field, typically after performing some validation.

    // We can not access variable directly without creating getters and setters methods
    // Two types of variable in Java : Local variable and class/Instance variable

    // (Note : Global variable {Created outside the class} is not present in java )
    // Two types of errors : Logical error & syntax error

//    Access modifiers ::
//    Access modifiers are keywords that are used in order to specify the accessibility of methods, variables & classes.

//    Private - Private members can only be accessed from within the same class, and not from any other class or instance.
//    Public - the public access modifier is used to specify that a class member (such as a variable or method)
//    can be accessed from anywhere in the program, including outside the class.
//    Protected - A third access modifier is called protected which comes into picture during inheritance.
//    Default – Accessible within the same package
    
    private int a;
    private int b;

    public void Getters(int a) {
        this.a = a;                 // This is used to identify and classify class variable and getters variable
        // When class variable and local variable
    }

    public int Setters() {
        return a;
    }

}
