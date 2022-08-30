package ClassAndObjects;

class Subjects{
    private String subjectID;
    private String SubjectName;
    private int maxMarks;
    private int marksObtain;

    Subjects(String subjectID, String SubjectName, int maxMarks){
        this.subjectID = subjectID;
        this.SubjectName = SubjectName;
        this.maxMarks = maxMarks;
    }

    public void setMaxMarks(int maxMr){
        maxMarks = maxMr;
    }

    public void setMarkObtains(int markObt){
        marksObtain = markObt;
    }

    public String getSubjectID(){ return subjectID; }
    public String getSubjectName(){ return SubjectName; }
    public int getMaxMarks(){ return maxMarks; }
    public int getMakrsObtain(){ return marksObtain; }

    boolean isQualified(int m){
        return m>=maxMarks;
    }

    boolean isQualified(){
        return marksObtain >= maxMarks/10*4;
    }

    public String toString(){
        return "\nSubject ID: " + subjectID + "\nSubject Name: " + SubjectName + "\nMarks Obtain: "+ marksObtain+" out of" + maxMarks;
    }
}

public class SubjectDetails {
    public static void main(String[] args) {
        Subjects objstud[] = new Subjects[3];
        objstud[0]= new Subjects("00111SCI", "Science", 100);
        objstud[1]= new Subjects("00112GUJ", "Gujarati", 100);
        objstud[2]= new Subjects("00113MATH", "Maths", 100);

        objstud[0].setMarkObtains(77);
        objstud[1].setMarkObtains(92);
        objstud[2].setMarkObtains(60);
        
        objstud[0].isQualified();
        objstud[1].isQualified();
        objstud[2].isQualified();

        for (Subjects s: objstud) {
            System.out.println(s);
        }
    }
}
