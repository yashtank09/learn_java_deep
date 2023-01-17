package Java_IO_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer implements Serializable{
    
    private String custID;
    String custName;
    private String phoneNumber;
    static int count = 0;
    Customer(){}
    public Customer(String custName, String phoneNumber){
        this.custID = "C"+count;
        count++;
        this.custName = custName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "\nCustomer Details:\n"+"\nID "+custID+"\nName "+custName+"\nPhone Number: "+phoneNumber;
    }
}

public class customerObjectChallange {
    public static void main(String[] args) throws ClassNotFoundException {
        
        Customer cust[] = {
            new Customer("Jasprit", "+917984248787"), 
            new Customer("Jordan", "+919852631470"),
            new Customer("Bush", "+18984248787")
        };
        try (FileOutputStream pos = new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/customers.txt")) {
            ObjectOutputStream oos = new ObjectOutputStream(pos);
            oos.writeInt(cust.length);
            for (Customer customer : cust) {
                oos.writeObject(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream pis = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Java_IO_Stream/customers.txt")) {
            ObjectInputStream ois = new ObjectInputStream(pis);
            
            int length = ois.readInt();
            Customer list[] = new Customer[length];

            for(int i=0; i<length; i++){
                list[i] = (Customer) ois.readObject();
            }

            for (Customer c : list) {
                System.out.println(c);
            }

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Name of Customer");
            String name = sc.nextLine();

            for(int i=0; i<length; i++){
                if(name.equalsIgnoreCase(list[i].custName)){
                    System.out.println(list[i]);
                }
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
