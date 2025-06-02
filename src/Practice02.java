// public class Practice02 extends Practice01 {

//     public Practice02(String name, String email) {
//         super(name, email);
//     }
//     public void showContent () {
//         super.getter();
//     }
//     public static void main(String[] args) {
//         Practice02 practice02 = new Practice02("Akshay", "Akshay@gmail.com")
//     }
// }
public class Practice02 extends Practice01 {

    public Practice02(String name, String email) {
        super(name, email);
    }

    public void showContent() {
        super.getter();             // ✅ Calls parent class's getter method
    }

    public static void main(String[] args) {
        Practice02 practice02 = new Practice02("Akshay", "Akshay@gmail.com");
        practice02.showContent(); // ✅ Actually calls the method
    }
}
