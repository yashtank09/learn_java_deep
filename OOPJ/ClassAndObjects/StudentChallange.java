package ClassAndObjects;

class studsChallange{
    private int rollNo;
    private String NameStud;
    private String DepartmentStud;
    private String SubjectsStud;

    studsChallange(int rollNo, String NameStud){
        this.rollNo = rollNo;
        this.NameStud = NameStud;
    }

    public void setDepStud(String DepStud){
        DepartmentStud = DepStud;
    }

    public void setSubStud(String SubjStud){
        SubjectsStud = SubjStud;
    }

    public int getrollN0(){ return rollNo; }
    public String getNameStudent(){ return NameStud; }
    public String getDepartmentStudent(){ return DepartmentStud; }
    public String getSubjectStudents(){ return SubjectsStud; }

    // toString - https://www.javatpoint.com/understanding-toString()-method
    public String toString(){
        return "::-Student Details-::"+"\nName: "+getNameStudent()+"\nRoll No.: "+getrollN0()+"\nDepartment: "+getDepartmentStudent()+"\nSubjects: "+getSubjectStudents();
    }

}

public class StudentChallange {
    public static void main(String[] args) {
        studsChallange sch = new studsChallange(20012, "Yash Tank");
        sch.setDepStud("A");
        sch.setSubStud("English");

        System.out.println(sch);
    }
}
