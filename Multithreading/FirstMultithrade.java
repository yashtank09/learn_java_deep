package Multithreading;

/** Multithreading
 *  Printing 'Hello....' and 'World!' by using Thread class for achiving multithreading.
 * 
 *  Thread class: https://www.geeksforgeeks.org/java-lang-thread-class-java/
 */

 // after extending Thread class, it will have all features of Thread class
class MyThread extends Thread{
    // For achiving Multithreading we have to override run() method of Thread class
    // overriding run method of Thread class
    public void run(){
        int i = 1;
        while(i <= 500){
            System.out.println(i++ +" Hello......");
        }
    }
}
public class FirstMultithrade {

    public static void main(String[] args) {
        
        // here referance `m` is thread
        MyThread m = new MyThread();
        m.start(); // for running Thread

        // after creating thread object loop of main method also run simultaneously

        int i = 1;
        while(i <= 500){
            System.out.println(i++ +" World!");
        }
    }
}