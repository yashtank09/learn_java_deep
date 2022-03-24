import java.util.Scanner;

class BankDetails{
    private String accountNumber;
    private String accountHolderName;
    private String accountType;
    private long totalBalance;
    Scanner sc = new Scanner(System.in);

    // Method for open New Account...
    public void openAccount(){
        System.out.println("Enter Account No: ");
        accountNumber = sc.next();
        System.out.println("Enter Account Type: ");
        accountType = sc.next();
        System.out.println("Enter Name: ");
        accountHolderName = sc.next();
        System.out.println("Enter Opening Balance: ");
        totalBalance = sc.nextLong();
    }

    // Display account details
    public void showAccountDetails(){
        System.out.println("Account No: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + totalBalance);
    }

    // Deposit money
    public void deposit(){
        long amount;
        System.out.println("Enter the amount you want to deposit: ");
        amount = sc.nextLong();
        totalBalance = totalBalance + amount;
    }

    // Withdrawl money
    public void withdrawl(){
        long amount;
        System.out.println("Enter the amount you want to deposit: ");
        amount = sc.nextLong();
        if(totalBalance >= amount){
            totalBalance = totalBalance - amount;
            System.out.println("Balance after withrawl: " + totalBalance);
        }
        else{
            System.out.println("Your balance is less than" + amount + "\tTransaction Failed...!!");
        }
    }

    public boolean search(String actNo){
        if(accountNumber.equals(actNo)){
            showAccountDetails();
            return true;
        }
        else{
            return false;
        }
    }

}
public class bankningApplicationConsoleBased {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create initial accounts
        int n = sc.nextInt();
        BankDetails bd[] = new BankDetails[n];

        for (int i=0; i < bd.length; i++){
            bd[i] = new BankDetails();
            bd[i].openAccount();
        }

        int ch;
        do {
            System.out.println("\n\t|   Banking System Application   |");
            System.out.println("1. Display All Account Details \n2. Search by Account Number \n3. Diposit Amount \n4. Withdraw the amount \n5. Exit");
            System.out.println("Enter You Choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    for(int i=0; i<bd.length; i++){
                        bd[i].showAccountDetails();
                    }
                    break;
                case 2:
                    System.out.println("Enter Account number you want to search: ");
                    String accNo = sc.next();
                    boolean find = false;
                    for (int i=0; i<bd.length; i++){
                        find = bd[i].search(accNo);
                        if(find){
                            break;
                        }
                    }
                    if(!find){
                        System.out.println("Search failed! Account dosen't Exist...");
                    }
                    break;
                case 3:
                    System.out.println("Enter Account Number: ");
                    accNo = sc.next();
                    find = false;    
                    for(int i=0; i < bd.length; i++){
                        find = bd[i].search(accNo);
                        if(find){
                            bd[i].deposit();
                            break;
                        }
                    }    
                    if(!find){
                        System.out.println("Search failed! Account dosen't Exist...");
                    }      
                    break;
                case 4:
                    System.out.println("Enter Account Number: ");
                    accNo = sc.next();
                    find = false;    
                    for(int i=0; i < bd.length; i++){
                        find = bd[i].search(accNo);
                        if(find){
                            bd[i].withdrawl();
                            break;
                        }
                    }    
                    if(!find){
                        System.out.println("Search failed! Account dosen't Exist...");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
            }

        }while(ch != 5);
    }
}