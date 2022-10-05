package Static_Final;

/*
    Static:
        The static keyword in Java is used for memory management mainly.
        The static keyword in Java is used to share the same variable or method of a given class.
*/


class StaticTest{
    // Static Datamember
    static int x = 10;
    int y = 20;

    void show(){
        // We can use static data member in any of the methods
        System.out.println(x+" "+y);
    }

    static void display(){
        // Non static member can not be referance of a static context
        // System.out.println(x+" "+y);
        System.out.println(x);
    }
}

public class StaticPractice {
    public static void main(String[] args) {
        StaticTest T1 = new StaticTest();
        T1.show();
        // T1.x = 33; // Modifiyed static datamember will be applied to every object created, also static datamember can be shared with every object of class 
        T1.y = 30;

        StaticTest T2 = new StaticTest();
        T2.show();
    }
}
