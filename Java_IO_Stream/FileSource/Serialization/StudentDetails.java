package Java_IO_Stream.FileSource.Serialization;

import java.io.Serializable;

// encapsulated with student properties
class StudentDetails implements Serializable{
    int rollNumber;
    String studentName;
    String studentDepartment;
    float avrageMarks;
    public StudentDetails(int rollNumber, String studentName, String studentDepartment){
        this.rollNumber = rollNumber;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
    }

    @Override
    public String toString() {
        return "\nStudent Details\n"+"\nRoll "+rollNumber+"\nStudent Name "+studentName+"\nStudent Departmetn "+studentDepartment+"\n";
    }
}
