package Challanges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * SortingComparator
 */

class Student {
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

/* class studentComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2) {
        // comparing via student CGPA
        if (s1.getCgpa() < s2.getCgpa()) return 1;
        if (s1.getCgpa() > s2.getCgpa()) return -1;

        // comparing via student first name
        if (s1.getFname() != s2.getFname()) return s1.getFname().compareTo(s2.getFname());

        // else return student 1 id - student 2 id
        return s1.getId() - s2.getId();
    }

} */

public class SortingComparator {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int testCases = Integer.parseInt(in.nextLine());
            
            List<Student> studentList = new ArrayList<Student>();
            while(testCases>0){
            	int id = in.nextInt();
            	String fname = in.next();
            	double cgpa = in.nextDouble();
            	
            	Student st = new Student(id, fname, cgpa);
            	studentList.add(st);
            	
            	testCases--;
            }

            // using anonymous object type
            Collections.sort(studentList, new Comparator<Student>() {

                @Override
                public int compare(Student s1, Student s2) {
                    // comparing via student CGPA
                    if (s1.getCgpa() < s2.getCgpa()) return 1;
                    if (s1.getCgpa() > s2.getCgpa()) return -1;

                    // comparing via student first name
                    if (s1.getFname() != s2.getFname()) return s1.getFname().compareTo(s2.getFname());

                    // else return student 1 id - student 2 id
                    return s1.getId() - s2.getId();
                }
                
            });
       
            for(Student st: studentList){
            	System.out.println(st.getFname());
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }        
    }
}