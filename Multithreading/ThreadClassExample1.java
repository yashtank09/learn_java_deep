package Multithreading;

/**
 * Thread Class Example 1
 *  - A classs implements Runnable interface that overrides run() method of Thread class
 */
class MyThread implements Runnable {
    @Override
    public void run(){}
}

// MyThread2 inherits Thread class
class MyThread2 extends Thread {
    public MyThread2(String name){
        // calling super class constructor and set the name to it
        super(name);
        setPriority(NORM_PRIORITY+2);
    }

    @Override
    public void run(){
        int count = 1;
        while(true){
            System.out.println(count++);
            try {
                // .sleep() method throwse an exception so we need to handle exception 
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO: handle exception
                System.out.println(e);
            }
                
        }
    }
}

public class ThreadClassExample1 {

    public static void main(String[] args) {
        // Thread class with non paramter constructor
        Thread t1 = new Thread();
        t1.getId();
        // Thread class with parameterized constructor that assign thread name
        Thread t2 = new Thread("My Thread");
        t2.getId();
        // Thread class with anonumous runnable object
        Thread t3 = new Thread(new MyThread(), "My Thread");
        t3.getId();

        // object of `MyThread2` class
        MyThread2 mt1 = new MyThread2("Thread of MyThread");

        /*===================== Methods=====================*/
        System.out.println("Thread ID: "+ mt1.getId());
        System.out.println("Thread Name: "+ mt1.getName());
        System.out.println("Thread Priority: "+ mt1.getPriority());
        System.out.println("Thread State: "+ mt1.getState()); // state will be 
        System.out.println("Thread Priority: "+ mt1.getPriority()); // priority will be 7
        mt1.start();
        mt1.interrupt();
        System.out.println("Thread is alive? "+ mt1.isAlive());
        System.out.println("Thread State: "+ mt1.getState()); // State will be RUNNABLE       
    }
}