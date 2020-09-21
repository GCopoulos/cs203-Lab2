/**
 * A simple Greeter class with a GoodBye and setName methods.
 *
 * @author Gerasimos Copoulos
 * @version v1
 * 
 */

public class Greeter
{
    /**
     * A String that saves the name used by this Greeter object.
     */
    String Name = "";
    
    /**
     * An empty constructor for Greeter objects.
     * 
     * @param none
     * @return None, just creates a Greeter object.
     */
    Greeter(){
        
    }
    
    /**
     * An empty constructor for Greeter objects.
     * 
     * @param s1    A String object which sets the name of this Greeter.
     * @return None, just creates a Greeter object.
     */
    Greeter(String s1){
        Name = s1;
    }
    
    /**
     * A hello method that greets the user.
     * 
     * @param none
     * @return no return value, just prints a hello message.
     */
    
    public void sayHello(){
        System.out.println("Hello there, " + Name + "!");
        return;
    }
    
    /**
     * A goodbye method to send the user off.
     * 
     * @param none
     * @return no return value, just prints goodbye
     */
    
    public void sayGoodbye(){
        System.out.println("Have a good day!  Goodbye!");
        return;
    }
    
    /**
     * A method which prints San Jose with a unicode character, meant
     * to demonstrate a knowledge of unicode in Java.
     * 
     * @param none
     * @return no return value, just prints text
     */
    
    public void saySanJose(){
        System.out.println("Hello, San Jose\u0351");
    }
    
    /**
     * A method which sets the name field of this class to the input string.
     * 
     * @param s1    A String represented the desired new name.
     * @return No return value, just changes Name field.
     */
    
    public void setName(String s1){
        Name = s1;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void swapNames(Greeter other){
        String NameSave = new String();
        NameSave = this.Name;
        this.Name = other.Name;
        other.Name = NameSave;
    }

}
