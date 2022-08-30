package ClassAndObjects;

/*
    Coustomer Data
 */
class customers{
    private String CustomerID;
    private String CustomerName;
    private String CustomerAddresss;
    private String CustomerPhoneNumber;

    customers(String CoustmoerID, String CustomerName){
        this.CustomerID = CoustmoerID;
        this.CustomerName = CustomerName;
    }

    public void setCustomerAddress(String CustAddress){
        CustomerAddresss = CustAddress;
    }

    public void setCustomerPhoneNumber(String CustPhone){
        CustomerPhoneNumber = CustPhone;
    }

    public String getCustID(){
        return CustomerID;
    }

    public String getCustName(){
        return CustomerName;
    }

    public String getCustAddress(){
        return CustomerAddresss;
    }

    public String getCustPhone(){
        return CustomerPhoneNumber;
    }
}

public class CustomerData {
    public static void main(String[] args) {
        customers cust = new customers("2256TY", "Yash Tank");
        cust.setCustomerAddress("So N So Address");
        cust.setCustomerPhoneNumber("+919999999999");
    }    
}