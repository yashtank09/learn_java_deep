package Inheritance;

public class SingleInheritMain {
    public static void main(String[] args) {
        SingleInheritEx2 emp = new SingleInheritEx2();
        emp.setage(22);
        emp.setname("Yash");
        emp.setempID("Tyj1234");
        System.out.println("Age: " + emp.getage());System.out.println("Name: " + emp.getname());
        System.out.println("Age: " + emp.getempID());
    }
}