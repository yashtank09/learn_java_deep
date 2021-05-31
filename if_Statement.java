
/**
 * if_Statement
 * if statement is used to whether the condition is true or false
 */
class condition{
    int age = 0;
    
    //creating a parameterized constructor
    public condition(int age){
        this.age = age;
    }
    public void ifstate(){
        /*
            ---if statement with condition and statement
            if(_condition_){
                _statement_
            }
        */
        // Program to check whter the age is eligible or not.
        if(this.age>18){
            System.out.println("You are not eligible for it...");
        }
    }
}
public class if_Statement {
    public static void main(String[] args) {
        // Here we created object of class condition
        condition age = new condition(15);
        age.ifstate();
    }
}