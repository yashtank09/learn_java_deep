package Basics.Conditional_Statement;
import java.lang.reflect.Method;

/**
 * if else if ladder
 * 
 * if(_condition_){
 *      statement
 * }
 * else if(_condition_){
 *      statement
 * }
 * else if(_condition_){
 *      statement
 * }else{
 *      statement
 * }
 * 
 */
class ledderif{
    int checknumber = 0;
    ledderif(int checknumber){
        this.checknumber = checknumber;    
    }
    //private void numcheck(): if we write this method with private it will give an error
    private void numcheck(){
    
        if(checknumber >= 0 && checknumber <= 10){
            System.out.println(checknumber + " is between 0 & 10.");
        }
        else if(checknumber >= 11 && checknumber <= 15){
            System.out.println(checknumber + " is between 11 & 15.");
        }
        else if(checknumber >= 16 && checknumber <= 20){
            System.out.println(checknumber + " is between 16 & 20.");
        }
        else{
            System.out.println(checknumber + " is greaterthan 20.");
        }
    }
}
/*
    Here we are use Reflection for access private method of above class
    Documentation: https://www.geeksforgeeks.org/reflection-in-Java/

    How to call private method from another class in Java with help of Reflection API?
    -> https://www.geeksforgeeks.org/how-to-call-private-method-from-another-class-in-java-with-help-of-reflection-api/

    -------------------------------------------------------------------------------------------------------------------

    - To call the private method, we will use following methods of Java.lang.class and Java.lang.reflect.Method
    Method[] getDeclaredMethods(): This method returns a Method object that reflects the specified declared method of the class
    or interface represented by this Class object.

    setAccessible(): Set the accessible flag for this object to the indicated boolean value. A value of true indicates that the
    reflected object should suppress Java language access checking when it is used. A value of false indicates that the reflected
    object should enforce Java language access checks.

    invoke():It invokes the underlying method represented by this Method object, on the specified object with the specified parameters.
*/
public class ifelseif_ladder {
    public static void main(String[] args)throws Exception {
        ledderif lif = new ledderif(18);
        // lif.numcheck();
        Method m = ledderif.class.getDeclaredMethod("numcheck");
        m.setAccessible(true);
        m.invoke(lif);

    }
}