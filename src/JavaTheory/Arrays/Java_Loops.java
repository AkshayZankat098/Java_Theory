package JavaTheory.Arrays;

public class Java_Loops {

    public static void main(String[] args) {
    }

    public static void pratice() {

    }

//While loop :: first check the condition then it's execute 
    public static void HelloMessage() {
        int i = 1;          //inilization

        while (i <= 10) {   //Condition
            System.out.println("Hello message");
            i++;            //Increment 
        }
    }

//Do while :: Atleast one time is execute without checking condition
    public static void DoWhile() {
        int i = 0;
        do {

            System.out.println(i);
            i++;

        } while (i <= 5);
    }

//For loop :: inilization, Condition, Increment all the three conditions are in one statement, Also if we
    public static void ForLoop() {

        //After Step:4 Step:2 will be execute
        //       Step:1 Step:2  Step:4 (Increment)
        for (int i = 0; i <= 5; i++) {
            //               Step:3 (Print value of I)
            System.out.println(i);
        }
    }

    public static void BreakExample() {
        int i = 1;

        while (true) {
            System.out.println("Hello message" + i);
            i++;

            if (i == 5) {
                break;
            }
        }
    }

    public static void ContiuneExample() {
        int i = 0;

        while (i <= 5) {
            System.out.println("Hello message" + i);
            i++;

            if (i == 3) {
                continue;
            }
        }
    }

}
