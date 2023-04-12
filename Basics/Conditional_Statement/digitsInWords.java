package Basics.Conditional_Statement;
public class digitsInWords {
    public static void main(String[] args) {
        int n=258, r;
        String s="";

        while(n>0){
            r = n % 10;
            n = n/10;
            s = s+r;
        }
        char c;
        for(int i=0; i<s.length();i++){
            c = s.charAt(i);
            switch(c){
                case '0': System.out.println("Zero ");
                break;
                case '1': System.out.println("One ");
                break;
                case '2': System.out.println("Two ");
                break;
                case '3': System.out.println("Three ");
                break;
                case '4': System.out.println("Four ");
                break;
                case '5': System.out.println("Five ");
                break;
                case '6': System.out.println("Six ");
                break;
                case '7': System.out.println("Seven ");
                break;
                case '8': System.out.println("Eight ");
                break;
                case '9': System.out.println("Nine ");
                break;
            }
        }
    }
}
