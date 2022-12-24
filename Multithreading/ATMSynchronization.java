package Multithreading;

class ATM{
    
    synchronized public void checkBalance(String name){

        // try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}
        System.out.println(name+" is checking his balance...");

    }

    synchronized public void withdrawn(String name, int balance){
        
        try {Thread.sleep(300);} catch (InterruptedException e) {e.printStackTrace();}

        System.out.println(name + " is have Rs. "+balance);

    }

}

class Customers extends Thread {
    
    ATM atm;
    private String name;
    private int bal;

    Customers(ATM atm, String name, int bal){
        this.atm = atm;
        this.name = name;
        this.bal = bal;
    }

    public void run(){
        atm.checkBalance(name);
        atm.withdrawn(name, bal);
    }

}

public class ATMSynchronization {
    public static void main(String[] args) {
        
         ATM atm = new ATM();

        Customers c1 = new Customers(atm, "Yash", 200);
        Customers c2 = new Customers(atm, "Kamal", 2100);

        c1.start();
        c2.start();

    }
}
