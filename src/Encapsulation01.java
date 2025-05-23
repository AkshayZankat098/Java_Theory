
public class Encapsulation01 {

    // Encapsulation : Practice of bundling/Wrapping the data (variables) and the
    // methods (functions) in to a single unit.
    // called a class, and restricting access to some of the object's components.

    // Key Aspects of Encapsulation:
    // 1) Private Variables
    // 2) Public Methods (Getters and Setters)

    // Getters : allow reading the value of a private field.
    // Setters : allow modifying the value of a private field, typically after
    // performing some validation.
    // We can not access veriable directly without creating getters and setters
    // methods

    // Two types of Veriable in Java : Local veriable and class/Instance veriable
    // (Note : Global veriable {Created outside the class} is not present in java )
    
    private int a;
    private int b;

    public void Getters(int a) {
        this.a = a; // This is used to identify and classify class veriable and getters veriable
                    // When class veriable and local veriable
    }

    public int Setters() {
        return a;
    }

    // Two types of errors : Logical error & syntax error

}
