package Multithreading;

class MainData {
    
    int value;
    boolean flag = true;

    synchronized void setValue(int v){
        while(flag!=true)
            try{wait(); Thread.sleep(500);}catch(Exception e){ System.out.println(e);}
        value = v;
        flag=false;
        notify();
    }

    synchronized int getValue(){
        int x = 0;
        while(flag!=false)
            try{wait();Thread.sleep(500);}catch(Exception e){ System.out.println(e);}
        
        x = value;
        flag = true;
        notify();

        return x;
    }

}


class producer extends Thread {
    MainData md;    
    producer(MainData data){
        md = data;
    }

    public void run(){
        int i = 0;
        while(i<=50){
            md.setValue(i);
            System.out.println("Produced... "+ i);
            i++;            
        }
    }
}

class consumer extends Thread {
    MainData md;
    consumer(MainData data){
        md = data;
    }

    public void run(){
        int value;
        while(true){
            value = md.getValue();
            System.out.println("Consumed... "+value);
        }
    }
}

public class ThreadInterCommunication {
    public static void main(String[] args) {
        MainData md = new MainData();

        producer p = new producer(md);
        consumer c = new consumer(md);

        p.start();
        c.start();
    }
}
