package ClassAndObjects;

class students{
    protected int rollNumber;
    protected String Student_Name;
    protected String Cource_Name;
    protected int Subject_English, Subject_Maths, Subject_Science;

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

    public String detailsofStudent(){
        return "Roll No.: " + rollNumber + "\nName: " + Student_Name + "\nCource Name: " + Cource_Name;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        students details = new students();

        details.rollNumber = 9;
        details.Student_Name = "Yash";
        details.Cource_Name = "Basic Funcamentals";
        details.Subject_English = 28;
        details.Subject_Maths = 32;
        details.Subject_Science = 40;

        System.out.println(details.totalMarks());
        System.out.println(details.avrageofMarks());
        System.out.println(details.grade());
        System.out.println(details.detailsofStudent());
    }
}
