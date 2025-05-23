public class Loops {

    public static void main(String[] args) {        
        ContiuneExample();
    }


//While loop first check the condition then it's execute 
    public static void HelloMessage() {
        int i = 1;          //inilization

        while (i <= 10) {   //Condition
            System.out.println("Hello message");
            i++;            //Increment 
        }
    }


//Atleast one time is execute without checking condition
    public static void DoWhile() {
        int i=0;
        do {
            
            System.out.println(i);
            i++;

        } while (i <= 5);
    }


//inilization, Condition, Increment all the three conditions are in one statement, Also if we
    public static void ForLoop() {

        //       Step:1 Step:2  Step:4 & After Step:4 Step2 will be execute
        for (int i=0;   i <= 5; i++) {
            //                 Step:3
            System.out.println(i);
        }
    }

    public static void BreakExample () {
        int i = 1;          

        while (true) {   
            System.out.println("Hello message" + i);
            i++; 
            
            if(i==5){
                break;
            }
        }
    } 
    
    public static void ContiuneExample () {
        int i = 0;          

        while (i <= 5) {   
            System.out.println("Hello message" + i);
            i++; 

            if(i==3){
                continue;
            }
        }
    } 
}
