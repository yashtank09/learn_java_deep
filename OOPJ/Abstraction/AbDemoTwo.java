package Abstraction;

// 
public class AbDemoTwo {
    public static void main(String[] args) {
        Iphone obj = new Iphone();
        // Samsung obj1 = new Samsung();
        show(obj);
    }
    
    // we can also instansiate class object as parameter
    public static void show(Phone obj){
        obj.showConfig();
    }
    
}

abstract class Phone {
    public abstract void showConfig();
}

class Iphone extends Phone{
    public void showConfig(){
        System.out.println("2 GB, IOS 15");
    }
}

class Samsung extends Phone{
    public void showConfig(){
        System.out.println("2 GB, Android 12");
    }
}