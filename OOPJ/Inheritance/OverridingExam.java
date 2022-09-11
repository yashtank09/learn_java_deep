package Inheritance;

class T1{
    protected void display(){
        System.out.println("Super T1 Display.");
    }
}

class T2 extends T1{
    public void display(){
        System.out.println("Sub T2 Display.");
    }
}

public class OverridingExam {
    public static void main(String[] args) {
        T1 a = new T2();
        a.display();
    }
}
