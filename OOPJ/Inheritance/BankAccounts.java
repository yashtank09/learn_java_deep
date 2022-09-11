package Inheritance;
/* 
 * Bank Account System Example
 */
class Accounts{
    private int Account_Number;
    private String Name_ACHolder;
    private String Address_ACHolder;
    private long PhoneNumber;
    private String DateOfBirth;

    Accounts(int Account_Number, String Name_ACHolder, String Address_ACHolder, long PhoneNumber, String DateOfBirth){
        this.Account_Number = Account_Number;
        this.Name_ACHolder = Name_ACHolder;
        this.Address_ACHolder = Address_ACHolder;
        this.PhoneNumber = PhoneNumber;
        this.DateOfBirth = DateOfBirth;
    }

    int getAC_Number(){
        return Account_Number;
    }

    String getACH_Name(){
        return Name_ACHolder;
    }

    String getACH_Address(){
        return Address_ACHolder;
    }

    long getPhoneNumber(){
        return PhoneNumber;
    }

    String DateOfBirth(){
        return DateOfBirth;
    }
}

class SavingAC extends Accounts{
    private int Saving_deposits;
    private int Saving_fix_deposits;

    SavingAC(int Account_Number, String Name_ACHolder, String Address_ACHolder, long PhoneNumber, String DateOfBirth, int Diposits){
        super(Account_Number, Name_ACHolder, Address_ACHolder, PhoneNumber, DateOfBirth);
        Saving_deposits = Diposits;
        this.Saving_fix_deposits=0;
    }

    void setDeposits(int valueDeposits){
        Saving_deposits += valueDeposits;
    }

    void setWithDraw(int valueWithdrawn){
        Saving_deposits -= valueWithdrawn;
    }

    void setFixedDeposit(int ValueFixDepo){
        Saving_fix_deposits += ValueFixDepo;
    }

    int getBalance(){
        return Saving_deposits;
    }

    int getFixDeposits(){
        return Saving_fix_deposits;
    }

    public String toString(){
        return "Name: "+getACH_Name()+"\nAccount Number: "+getAC_Number()+"\nAccount Balance: "+getBalance()+"\nFix Deposits: "+getFixDeposits();
    }
}

public class BankAccounts {
    public static void main(String[] args) {
        SavingAC sc = new SavingAC(987654321, "Yash Tank", "Junagadh, Gujarat.", 9876543210L, "01/01/2022", 300);
        System.out.println(sc);

        sc.setDeposits(3700);

        System.out.println("\n"+sc);

        sc.setFixedDeposit(1000);

        System.out.println("\n"+sc);
    }
}
