package Multithreading;

/* 
 *  Multithreading using Runnable interface
 *      Printing 'Hello....' and 'World!' by using Thread class for achiving multithreading.
 * 
 *      Runnable Interface: https://www.geeksforgeeks.org/runnable-interface-in-java/
 */

// Class implements Runnable interface, we have to run it as a thread but it is not thread
// Runnable is capable of running but it can not run by it self
class TestThread implements Runnable{
    public void run(){
        int i = 1;
        int j = 50;
        while(i <= j){
            System.out.println(i+" World!..");
            i++;
        }
    }
}

public class MultithreadingRunnableInterface {
    public static void main(String[] args) {
        
        TestThread t = new TestThread(); // This is not a thread
        // we need an object of class Thread for running class TestThread as Thread
        Thread nt = new Thread(t);
        nt.start();
        
        int i = 1;
        int j = 50;
        while(i <= j){
            System.out.println(i+" Hello......");
            i++;
        }
    }
}
