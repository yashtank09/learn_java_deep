package Multithreading;

class ExaThread extends Thread {
    public void run(){
        int c = 1;
        while(c<=500000){
            System.out.println(c++ +"ExaThread");
        }
    }
}

public class ThreadClassExample2 {
    public static void main(String[] args) throws Exception {
        ExaThread et = new ExaThread();
        et.setDaemon(true); // it terminates main method
        et.start(); // after this statement main method should wait untile the thread of ExaThread class is running

        // try { Thread.sleep(1000); } catch (Exception e) { System.out.println(e); } // before terminating main will sleep for a while
        
        // Force joining the Thread
        // Thread tMain = Thread.currentThread();
        // tMain.join(); // it will join any other join which is running so it wait for other Thread to terminate

        int c = 1;
        while(c<=500000){
            System.out.println(c++ +"Main");
            Thread.yield(); // it will give more time to other thread for execution
        }

    }
}
