package OOPJ.Methods;

/*
    Method:
        - More generally, method declarations have six components, in order:
        - Modifiers—such as public, private, and others you will learn about later.
        - The return type—the data type of the value returned by the method, or void if the method does not return a value.
        - The method name—the rules for field names apply to method names as well, but the convention is a little different.
        - The parameter list in parenthesis—a comma-delimited list of input parameters, preceded by their data types, enclosed by parentheses, (). If there are no parameters, you must use empty parentheses.
        - An exception list—to be discussed later.
        - The method body, enclosed between braces—the method's code, including the declaration of local variables, goes here.

    >> Value of actual parameter will copy into formal parameter, even if it holds Array referance
 */
public class MethodPractical {
    // User Define Method | Formal Parameter
    static int max(int x, int y){
    // int max(int x, int y){
        if(x > y){
            return x;
        }else{
            return y;
        }
    }
    // Signature Main method
    public static void main(String[] args) {
        int a = 10, b = 15;

        // MethodPractical me = new MethodPractical(); // Creating an object of class and call the method
        // System.out.println(me.max(a, b));

                                       // if we are not make max method static so this error will raise, becaseu static method should only call static methods
        System.out.println(max(a,b));  // Cannot make a static reference to the non-static method max(int, int) from the type MethodPractical 
                         //Actual Parameter
    }
}