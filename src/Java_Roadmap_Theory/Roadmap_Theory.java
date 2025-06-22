package Java_Roadmap_Theory;

public class Roadmap_Theory {

// JDK : The first step of installation helps us to compile the code into machine language.
// JVM
// JRE
// Naming convention : PascalNamingConvention / camelNamingConvention / sanke_naming_convention
// Run code process : Source code >Compiler did by javac (Convert into byte code or machine understanding language : .java source files into .class bytecode files) >  JVM
// Variables :
// Datatypes (Premitive not-premitive) 
// String & String methods 
// Arrays & Arrays sorting
// Main keyWords 
// Casting in java 
// Math class 
// Input from user
// Operators


//    1) Java coding :
//    - Check if it's a prime number
//    - Same code for below all the problem
//           (- Find the sum of first 'N' natural numbers
//            - Find the sum of all integers from 1 to n
//            - Add all the numbers from 1 to n)
//    - Find the sum of the two arrays
//    - Search for the given target
//    - Reverse the array (Not solved)
//    - Check if the given array is in non-decreasing
//    - Find the given element
//    - Find the smallest num in array
//    - Find the total number of students (Not solved)
//    - Determine the matrix center (Not solved)
//    - Find the diagonal sum (Not solved)
//    - Determine the matrix T sum (Not solved)
//    - Java 101 session 7 is Important
//
//    2) Java Theory
//    3) Selenium coding
//    4) Manual Testing

    // What is stack and heap memory ?
    // What is attributes, Parameters, static and non-static, this & super keywords, And access modifies ?
    // What is Declaration and initialization in java? : Assigning a value to a variable or methods
    // What is top Array important methods ?
    // How java code run via notepad.?

// 1) What is static and non - static methods ::
// Static methods: Can be called without creating an object of the class, Belong to the class. (Syntax : ClassName.staticMethodName();)
// As we do not required to create object So we can manage memory using static method
// Non-static methods: Require an object of the class to be called, Belong to instances (objects) of the class. (ClassName obj = new ClassName(); obj.nonStaticMethodName();)
// Rule ::
//    "static" methods belongs to the class, not to the object.
//    "static" method can be accessed directly by class name and does’nt need any object.
//    "static" method can access only static data. It cannot access non-static data (instance data).
//    "static" method can call only other static methods and cannot call a non-static method.
//    "static" method cannot refer to "this" or "super" keyword in anyway.

// 2) What is this keyword & why use ::
// this keyword: When a local variable (e.g., method parameter) has the same name as an instance (Class) variable,
                // Java uses the "this" keyword to distinguish the instance variable from the local variable.

// 3) Explain PSVM ::
// Valid Main Method Signature:
//    public static void main(String[] args) : default signature.
//    public static void main(String[] arguments) : changing the identifier args to different name.
//    static public void main(String[] args) : static and public positions are interchanged.
//    public static void main(String []args) : different way of allowed String array declaration.
//    public static void main(String args[]) : different way of allowed String array declaration.
//    public static void main(String... args) : arrays can be replaced with var arg syntax.

// Invalid Main Method Signature:
//    public static void Main(String[] args) : capital M in identifier main
//    public static String main(String[] args) : returning String instead of void
//    private static void main(String[] args) : changing access modifier
//    public static void main(String args) : passing String as an argument instead of String[] array



}
