package Collection_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

/** Menu Driven Bank Account applicatoin
 *  - Create Account
 *  - Delete Account
 *  - View Account
 *  - View All Account
 *  - Save Account
 *  - Exit
 */
class Account implements Serializable {
    
    String AccountNo;
    String AccountName;
    Double AccountBalance;

    Account(String AccountNo, String AccountName, Double AccountBalance){
        this.AccountNo = AccountNo;
        this.AccountName = AccountName;
        this.AccountBalance = AccountBalance;
    }

    public String toString(){
        return "Account No: "+AccountNo+"\nName: "+AccountName+"\nBalance: "+AccountBalance;
    }
}

public class menuDriven_bank_applicatoin {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            Account ac = null;
            HashMap<String, Account> hm = new HashMap<>();

            try (FileInputStream fis = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/accounts.txt"); ObjectInputStream ois = new ObjectInputStream(fis)) {
                int count = ois.readInt();
                for(int i=0; i<count; i++){
                    ac = (Account) ois.readObject();
                    System.out.println(ac);
                    hm.put(ac.AccountNo, ac);
                }
            } catch (Exception e) {
                System.out.println(e);
            }

            FileOutputStream fos = new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/accounts.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            System.out.println("Menu");

            int choice;
            String accno, name;
            double balance;

            do {
                System.out.println("1. Create Account");
                System.out.println("2. Delete Account");
                System.out.println("3. View Account");
                System.out.println("4. View All Account");
                System.out.println("5. Save Account");
                System.out.println("6. Exit");
                choice = sc.nextInt();

                sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])");

                switch (choice) {
                    case 1:
                        System.out.println("Enter Details Account No, Name, Balance ");
                        accno = sc.nextLine();
                        name = sc.nextLine();
                        balance = sc.nextDouble();
                        ac = new Account(accno, name, balance);
                        hm.put(accno, ac);
                        System.out.println("Account created for "+name);
                        break;
                    case 2:
                        System.out.println("Enter Account No. ");
                        accno = sc.nextLine();
                        hm.remove(accno);
                        break;
                    case 3:
                        System.out.println("Enter Account No. ");
                        accno = sc.nextLine();
                        ac = hm.get(accno);
                        System.out.println(ac);
                        break;
                    case 4:
                        for(Account a: hm.values()){
                            System.out.println(a);
                        }
                    case 5:
                        oos.writeInt(hm.size());
                        for (Account a : hm.values()) {
                            oos.writeObject(a);
                        }
                        break;
                    default:
                        break;
                }
            } while (choice!=6);
            oos.close();
            oos.flush();
            fos.close();
        }
    }
}