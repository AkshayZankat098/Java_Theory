package JavaTheory.Oops_Concepts.inheritance;

public class Inheritance {   //Object is the parent class of the classes present in java

//Inheritance : Acquiring all the properties (Variables) & behaviour (Methods) from one class to another class is called inheritance.
// Also, we can achieve polymorphism or method overriding via inheritance.
// With the help of extend keywords we can achieve this
// Parents/Base/Super and Child/Super/Sub class
// How to change Parents class Variables value inside the child class?

// TYPES OF INHERITANCE :
//1) Single inheritance Example : 
    static class A {

        int a = 10;
    }

    static class B extends A {

        int b = 20;
        int a = 30;
    }

//2) Multilevel inheritance Example : 
    static class C extends B {

        int c = 30;
    }

//3) Hierarchy inheritance Example : Parents class is same for all chailed class 
    static class Parents {

        int Parents = 40;
    }

    static class Chiled1 extends Parents {

        int Chiled1 = 50;
    }

    static class Chiled2 extends Parents {

        int Chiled2 = 60;
    }

// Multiple inheritance Example : Multiple parents and single Chiled (Not support using class)
    public static void main(String[] args) {

//1) Single inheritance : 
        B bobj = new B();
        System.out.println(bobj.b);
        System.out.println(bobj.a);

//2) Multilevel inheritance : 
        C cobj = new C();
        System.out.println(cobj.a);
        System.out.println(cobj.b);
        System.out.println(cobj.c);

//3) Hierarchy inheritance : 
        Chiled1 Chiled1obj = new Chiled1();
        System.out.println(Chiled1obj.Parents);
        System.out.println(Chiled1obj.Chiled1);

        Chiled2 Chiled2obj = new Chiled2();
        System.out.println(Chiled2obj.Parents);
        System.out.println(Chiled2obj.Chiled2);
    }
}
