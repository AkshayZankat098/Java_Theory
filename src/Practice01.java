
public class Practice01 {

    private String name;
    private String email;

    public Practice01(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void getter() {
        System.err.println("Getter method is called..");
        System.err.println(name);
    }

    public void Setter() {
        System.err.println("Setter method is called..");
        System.err.println(email);
    }
}
