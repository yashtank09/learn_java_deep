/*
 * This is calculatro where you can perform Addition, Multiplicatoin, Division, Substraction, etc. operation on console
 * 
 * Also we are importing calculatorClass from OOPJ package
 *  
 */
import java.util.Scanner;

public class AccessCalculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Values 1: ");
            double val1 = sc.nextDouble();

            System.out.println("Enter Values 2: ");
            double val2 = sc.nextDouble();

            System.out.println("Enter operation: ");
                                // this is method to take char input from console
            char operator = sc.next().charAt(0); // take operation by using char operator variable

            calculatorClass cal = new calculatorClass(val1, val2);
            
            switch(operator){
                case '+': // checking input operator
                    System.out.println(cal.addition()); // calling methods from calculatorClass class.
                    break;
                case '-':
                    System.out.println(cal.substraction());
                    break;
                case '*':
                    System.out.println(cal.multiplication());
                    break;
                case '/':
                    System.out.println(cal.division());
                    break;
                default:
                    System.out.println("You enter invalid INPUT");
                    break;
            }
        }

    }
}
