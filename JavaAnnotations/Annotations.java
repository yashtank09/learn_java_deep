package JavaAnnotations;

/**
 * @Override annotation
 * Which will indicate that method is overrided, if there's spelling mistake in method name it will raise an error
 */

abstract class Parent{
    abstract public void display();
}

class child extends Parent{
    // this is overrided method but if we are not overriding this method which is abstract then it will rais an error
    public void display(){
        // statemetn
    }
}

class nonAbstractPerent {
    
    public void display(){
        System.out.println("Hii");
    }

}

class nonAbstractChild extends nonAbstractPerent {
    
    // method name is different from extended class but how could we know that this method is not overrided
    // for that we have @Overrided annotation which will raise error if method is not overridable
    @Override
    // public void dispay(){ // this will not raise any error
    public void display(){
        System.out.println("Hello");
    }

}

public class Annotations {
    public static void main(String[] args) {
        
    }
}
