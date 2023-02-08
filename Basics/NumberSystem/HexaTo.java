package Basics.NumberSystem;
import java.util.Scanner;
class DesimalTo
{
    Scanner scan;
	int num;
	void getVal() {

        System.out.println("Decimal to HexaDecimal,Octal and Binary");
	    scan = new Scanner(System.in);
 	    System.out.println("\nEnter the number :");
        num = Integer.parseInt(scan.nextLine());
        
	}
	void convert(){

	    String octal = Integer.toOctalString(num);
        System.out.println("Octal Value is : " + octal);

        String binary = Integer.toBinaryString(num);
        System.out.println("Binary Value is : " + binary);

        String deci = Integer.toString(num);
        System.out.println("Decimal Value is : " + deci);
        
	}
 }
class HexaTo
{
  public static void main(String args[]){
        DesimalTo obj = new DesimalTo();
        obj.getVal();
        obj.convert();
   }
}