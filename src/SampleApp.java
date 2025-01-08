public class SampleApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Checkstyle Testing!"); // Proper comment format
        
        int number= 10; // Bad formatting: no spaces around "="
        if(number > 5)
            System.out.println("Number is greater than 5"); // Missing braces violation
    }
    
    // Improperly formatted method (to test a rule)
    public void methodWithoutSpace(){System.out.println("Improper formatting");}
}
