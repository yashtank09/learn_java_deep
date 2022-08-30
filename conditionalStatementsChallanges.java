import java.util.Scanner;

public class conditionalStatementsChallanges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your Radix: ");
        String radixStr = sc.next();

        if(radixStr.matches("[01]+")){
            System.out.println("Binary Number");
        }else if(radixStr.matches("[0-9]+")){
            System.out.println("Decimal Number");
        }else if(radixStr.matches("[0-7]+")){
            System.out.println("Octal Number");
        }else if(radixStr.matches("[0-9A-F]+")){
            System.out.println("Hexa Decimal Number");
        }else{
            System.out.println("Invalid Number you have entered");
        }

        // Find given Year is leap year or not
        System.out.print("Enter Year: ");
        int Year = sc.nextInt();

        /*if(Year % 4 == 0){
            if(Year % 100 == 0){
                if(Year % 400 == 0){
                    System.out.println("Leap Year...");
                }
            }            

        }else{
            System.out.println("Not Leap Year...");
        }*/

        if((Year % 4 == 0 && Year % 100 != 0) || (Year % 100 == 0)){
            System.out.println("Leap Year...");
        }else{
            System.out.println("Not Leap Year");
        }
        sc.nextLine();
        // uniloc Locator
        // https://www.google.com

        System.out.print("Enter URL: ");
        String uniloc = sc.nextLine();

        String protocol = uniloc.substring(0, uniloc.indexOf(":"));
        
        if(protocol.equals("http")||protocol.equals("https")){
            System.out.println("Hyper Text Transfer Protocol");
        }else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }

        String domai = uniloc.substring(uniloc.lastIndexOf(".")+1);
        if(domai.equals("com")){
            System.out.println("Commercial Domain");
        }else if(domai.equals("org")){
            System.out.println("Organization Domain");
        }else if(domai.equals("edu")){
            System.out.println("Educational Domain");
        }else if(domai.equals("in")){
            System.out.println("Indian Domain");
        }else if(domai.equals("gov")){
            System.out.println("Government Domain");
        }

        sc.close();
    }
}
