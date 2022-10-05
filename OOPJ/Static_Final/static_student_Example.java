package Static_Final;

import java.util.*;

/* 
    Student class for creating auto-generated rollnumber using static count variable and private datamember and rollnumber generator.
*/

class Student{
    private String rollNumber;

    // count that will be increament when ever a new object is created because it is static
    private static int count=1;
    
    // Auto-generator for rollnumber that will return string rollnumber format like this: "UNIV-20221"
    private String generateRollnumber(){
        Calendar c = Calendar.getInstance();

        // Here we are creating an rollnumber
        String str = "UNIV-"+(c.get(Calendar.YEAR))+count;

        // incrementing count that will affect for every new object created
        count++;
        return str;
    }

    // Get rollnumber
    public String getRollnumber(){
        return rollNumber;
    }

    public Student(){
        rollNumber = generateRollnumber();
    }
}

public class static_student_Example {
    public static void main(String[] args) {
        // When ever we create a new object it will generate new rollnumber
        Student s = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        
        // here we can see the counter for rollnumber is incrementing when ever new object is created so it means the counter variable is same for every object
        System.out.println(s.getRollnumber());
        System.out.println(s2.getRollnumber());
        System.out.println(s3.getRollnumber());
    }
}

/* 
    Depricated method: A program element annotated @Deprecated is one that programmers are discouraged from using,
    typically because it is dangerous, or because a better alternative exists.
*/