package Inheritance;
/* 
    - Signature of Method must be same for overriding a methods.
    - Java is case sensitive so name must be same for overiding.
    - We can not override static & final methods.
    - Different return types is also not allowed for both method overiding or overloading.
 */
// Understanding class return types
class AA{ AA(){System.out.println("Return Object of Class 'AA'.");}}
class BB extends AA{BB(){System.out.println("Return Object of Class 'BB'.");}}


class ASuper{
    /* 
        Using Modifiers
        public void display() Not overriden
        protected void display() Overriden
        protected void display() Overriden
        private void display() Not Overriden
        public void display() Not Overriden

     */
    public void display(){
        System.out.println("Super Display");
    }

    // Return type is 'class A' and returning object of 'class AA'
    public AA foo(){ return new AA();}
}

class ASub extends ASuper{
    
    /* 
        Using Modifiers
        private void display() Not override
        protected void display() Override
        public void display() Override
        public void display() Not Override
        protected void display() Not Override
     */
    /* 
        public int display(){
            return 0;
        }
        - Incompetible return type
    */
    
    // Method Overloading |  instade it's a method overloading using different parameters.
    public void display(int a){
        System.out.println("Method Overloaded");
    } // This is not same signature for overriding.

    @Override
    // Overrided method of sub class could be final, but super class overrided method must not to be final.
    final public void display(){
        System.out.println("Sub Diaplsy");
    }

    // Return type is 'class BB' and returning object of 'class BB'
    public BB foo(){ return new BB(); }
}

public class RulesofOverriding {
    public static void main(String[] args) {
        ASub s = new ASub();
        s.display();
    }
}
