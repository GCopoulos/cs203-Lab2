import java.util.Scanner;


/**
 * An app for modifying and using Greeter objects.
 *
 * @author Gerasimos Copoulos
 * @version 1
 */
public class GreeterApp
{

    /**
     * Constructor for objects of class GreeterApp
     */
    public GreeterApp(){

    }
    
        
    /**
     * The main method containing the active body of the code.
     */
    
    public static void main(String[] args){
        Greeter Greeter1 = new Greeter("John");
        Greeter Greeter2 = new Greeter("Mary");
        Greeter1.sayHello();
        Greeter2.sayHello();
        Greeter1.swapNames(Greeter2);
        Greeter1.sayHello();
        Greeter2.sayHello();
        Greeter1.sayGoodbye();
    }
}
