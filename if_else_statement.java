class ifelse{
    int age = 0;
    
    //creating a parameterized constructor
    public ifelse(int age){
        this.age = age;
    }
    public void ifstate(){
        /*
            ---if-else statement with condition and statement
            if(_condition_){
                _statement_
            }else{
                _statement_
            }
        */
        // Program to check whter the age is eligible or not.
        if(this.age>18){
            System.out.println("You are not eligible for it...");
        }else{
            System.out.println("You are eligible for it...");
        }
    }
}
public class if_else_statement {
    public static void main(String[] args) {
        ifelse age = new ifelse(15);
        age.ifstate();
    }
}
