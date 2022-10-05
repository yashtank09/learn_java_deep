package Static_Final;

/* 
    Some time we want one single object, some time we want to maintain fixed numer of object only beyond that, new objects are not created
    it may throw exception or it may return null value.

    More about Singleton Class: https://www.geeksforgeeks.org/singleton-class-java/ 
 */

class CoffieMachine{
    private float coffieQty;    
    private float milkQty;    
    private float waterQty;    
    private float SugarQty;
    
    // property having referance of one instance of class
    static private CoffieMachine my = null;

    // This is private constructor so we can not create an object of class outside of the class
    private CoffieMachine(){
        coffieQty = 1;
        milkQty = 1;
        waterQty = 1;
        SugarQty = 1;
    }

    public void fillWater(float qty){
        waterQty = qty;
    }

    public void fillSugure(float qty){
        SugarQty = qty;
    }

    public float getCoffee(){
        return 0.23f;
    }

    // This method return the referance of class
    static CoffieMachine getInstance(){
        if(my==null)
            my = new CoffieMachine();
        return my;
    }
}

public class SingletonClasses {
    public static void main(String[] args) {
        
        // Getting referances of CoffieMachine class that all referances are same
        // because they are refering to same object
        CoffieMachine m1 = CoffieMachine.getInstance();
        CoffieMachine m2 = CoffieMachine.getInstance();
        CoffieMachine m3 = CoffieMachine.getInstance();

        System.out.println(m1 + " | " + m2 + " | " + m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
    }
}
