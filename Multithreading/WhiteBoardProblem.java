package Multithreading;

class WhiteBoard {
    String texts;
    int numberOfStudent = 0;
    int count = 0;

    public void attendance(){
        numberOfStudent++;
    }

    synchronized public void write(String t){
        System.out.println("Teacher is writing..." + t);
        while(count!=0)
            try{wait();}catch(Exception e){}
        texts = t;
        count = numberOfStudent;
        notifyAll();
    }

    synchronized public String read(){
        while(count==0)
            try{wait();}catch(Exception e){}

        String t = texts;
        count--;
        if(count==0)
                notify();
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String notes[] = {"Java is language", "It is OOPs", "It is platform independent", "It supports Thread", "end"};
    public Teacher(WhiteBoard wb){
        this.wb=wb;
    }
    public void run(){
        for(int i=0;i<notes.length;i++)
            wb.write(notes[i]);
    }
}

class Students extends Thread {
    String name;
    WhiteBoard wb;
    public Students(String name, WhiteBoard wb){
        this.name = name;
        this.wb = wb;
    }
    public void run(){
        String text;
        wb.attendance();
        do{
            text = wb.read();
            System.out.println(name + " Reading  " + text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}

public class WhiteBoardProblem {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();

        Teacher t = new Teacher(wb);
        
        Students s1 = new Students("1. Yash", wb);
        Students s2 = new Students("2. Jay", wb);
        Students s3 = new Students("3. Jitesh", wb);
        Students s4 = new Students("4. Mohan", wb);
        
        t.start();
        
        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }   
}
