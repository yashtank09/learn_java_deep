import java.util.Scanner;
class OctalTo_all
{
    Scanner scan;
	int num;
	void getVal() {

        System.out.println("Octal To Binary and Hexadesimal number");
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
class OctalTo
{
  public static void main(String args[]){
        OctalTo_all obj = new OctalTo_all();
        obj.getVal();
        obj.convert();
   }
}