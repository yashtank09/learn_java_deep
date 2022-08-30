package ClassAndObjects;

/* 
    Getters and Setters are property methods.
    Types of Propertie Methods:
    1. Read & Write - it contains both getter & setter methods
    2. Read Only - it contains only getter method that only use for fetching data of data member
    3. Write Only - it contains only setter method that only use for assigning value to data members
 */
class StudentsData{
    private int rollNumber;
    private String Student_Name;
    private String Cource_Name;
    private int Subject_English, Subject_Maths, Subject_Science;
    
    public void setBasicDetails(int RollNumber, String studentName, String courceName){
        rollNumber = RollNumber;
        Student_Name = studentName;
        Cource_Name = courceName;
    }

    public void setMarks(int English, int Maths, int Science){
        Subject_English = English;
        Subject_Maths = Maths;
        Subject_Science = Science;
    }

    public int totalMarks(){
        return Subject_English + Subject_Maths + Subject_Science;
    }

    public float avrageofMarks(){
        return (float)totalMarks()/3;
    }

    public char grade(){
        if(avrageofMarks()>80){
            return 'A';
        }else if(avrageofMarks()<=80 && avrageofMarks()>65){
            return 'B';
        }else if(avrageofMarks()<=65 && avrageofMarks()>35){
            return 'C';
        }else{
            return 'F';
        }
    }

    public String getdetailsofStudent(){
        return "Roll No.: " + rollNumber + "\nName: " + Student_Name + "\nCource Name: " + Cource_Name;
    }
}
public class StudentDatahiding {
    public static void main(String[] args) {
        StudentsData stud = new StudentsData();

        stud.setBasicDetails(21, "Yash", "MCA");
        stud.setMarks(55, 56, 47);

        System.out.println(stud.getdetailsofStudent());
        System.out.println("Total makrs: "+stud.totalMarks());
        System.out.printf("\nAvrage of Makrs: %.2f", stud.avrageofMarks());
    }
}
