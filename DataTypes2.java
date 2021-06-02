public class DataTypes2 {
    public static void main(String[] args) {
        // Case Sensitive
        int Yash;
        int yash;
        
        // char abc;
        // short abc; //This gives an error

        // Contains Alphabet, _, $
        long room4;
        char emp_name;
        float balancesheet$profit$loss;

        // Starts with Alphabet, _, $
        // char 25cd; //This is not allowed
        char bd56;

        // Should not be a keyword
        //char do; //do is a keyword so it will not work
        //long class; // class is also a keyword

        // hould not be a class name, if class is also in use
        char String; // it will work but it's not sutable for programming so avoid it

        // No limit on length of name
        long marksheet$numbers$of$strudensts;
        char your$resident$address$or$office$address;

        // Follow camel case
        long rollNumber;
        char FirstName;
        double ProfitAfterTax; //These are the camel case variable names.
    }
}
