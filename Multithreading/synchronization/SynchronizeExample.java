package Multithreading.synchronization;

class DataSource {
    // give signature to method to use synchronization, so this method becames ''monitor''
    synchronized public void SyncDisplay(String data){
    // synchronized(this){ // We can make block as synchronized
        // printing a string by each word of that string also we can call this section a ''critical'' section
        for(int i=0; i<data.length(); i++){
            System.out.print(data.charAt(i));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    // }
    }
}

// after using synchroniztion it will be monitored by synchronized method it self

class SyncThread1 extends Thread {
    
    DataSource d; // referance of 'DataSource' class

    SyncThread1(DataSource ds){
        d = ds;
    }

    public void run(){
        d.SyncDisplay("Hello World");
    }
}

class SyncThread2 extends Thread {
    
    DataSource d; // referance of 'DataSource' class

    SyncThread2(DataSource ds){
        d = ds;
    }

    public void run(){
        d.SyncDisplay("Welcome All");
    }
}

public class SynchronizeExample {

    public static void main(String[] args) {
            
        DataSource datasource = new DataSource();

        SyncThread1 Sync1 = new SyncThread1(datasource);
        SyncThread2 Sync2 = new SyncThread2(datasource);
        
        Sync1.start();
        Sync2.start();
    }

}
