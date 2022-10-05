package Static_Final;

// final class will not be extends to any other class, you can use it directly
final class A1{
    public void display(){
        System.out.println("Hello Ji!");
    }
}
/* 
// Error: The type A2 cannot subclass the final class A1
class A2 extends A1{
    public void display(){
        System.out.println("Hello Yash!");
    }
}
 */
public class finalClass {
    public static void main(String[] args) {
        A1 a = new A1();
        a.display();
    }    
}
