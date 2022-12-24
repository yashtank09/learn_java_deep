package Multithreading.synchronization;

class datasync {
    public void displayWSync(String data){
        // printing a string by each word of that string
        for(int i=0; i<data.length(); i++){
            System.out.print(data.charAt(i));
        }
    }
}

class WSyncThred1 extends Thread {
    
    datasync d; // referance of 'datasync' class

    WSyncThred1(datasync data){
        d = data;
    }

    public void run(){
        d.displayWSync("Hello World");
    }
}

class WSyncThred2 extends Thread {
    
    datasync d; // referance of 'datasync' class

    WSyncThred2(datasync data){
        d = data;
    }

    public void run(){
        d.displayWSync("Welcome");
    }
}

public class exampleWithoutSync {
    public static void main(String[] args) {
        // object of shared resource
        datasync ds = new datasync();
        
        // objects of thread class
        WSyncThred1 ws1 = new WSyncThred1(ds);
        WSyncThred2 ws2 = new WSyncThred2(ds);
        
        ws1.start();
        ws2.start();

        // without syncronizing the Threads we got mixed data, let's create Thread using synchronization
    }    
}
