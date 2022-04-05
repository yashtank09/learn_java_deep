package OOPJ;
/*
 *  https://www.tutorialspoint.com/java/java_encapsulation.htm#:~:text=Encapsulation%20in%20Java%20is%20a,methods%20of%20their%20current%20class.
 *  
 *  Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
 * 
 */
class student{

    // This is private variables that can not be accessible outof this class so we are useing 'getter & setter' methods
    private int rollNumber;
    private String StudentName;
    private int age;
 
    public void setrollNumber(int rollNum){
        // Here var rollNumber stores value from parameter
        rollNumber = rollNum;
    }

    public int getrollNumber(){
        return rollNumber;
    }

    public void setStudentName(String StudName){
        // Here var StudentName stores value from parameter
        StudentName = StudName;
    }

    public String getStudentName(){
        return StudentName;
    }

    public void setAge(int studage){
        // Here var age stores value from parameter
        age = studage;
    }

    public int getage(){
        return age;
    }
}

public class encapsulationEx {
    public static void main(String[] args) {
        student s = new student();
        s.setrollNumber(1223);
        s.setStudentName("Yash");
        s.setAge(20);

        // Here we can get the private variable's values without directly accessing them
        System.out.println("Student Roll Number: " + s.getrollNumber());
        System.out.println("Student Name: " + s.getStudentName());
        System.out.println("Student Age: " + s.getage());
    }
}
