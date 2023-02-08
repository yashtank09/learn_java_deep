import java.util.Scanner;

class scannerClass{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int integer = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            
            System.out.println("Your Integer: " + integer);
            System.out.println("Your String: " + str);
            // char character = sc.next().charAt(4); //.char() parameter take index value and give that charachter's value
        }
        
        
        
        // long loong = sc.nextLong();
        
        // double dooble = sc.nextDouble();
        
        // boolean bool = sc.nextBoolean();

        
        // System.out.println("Your long Value: " + loong);
        // System.out.println("Your double value: " + dooble);
        // System.out.println("Your charachter: " + character);
        
        // System.out.println("Your boolean: " + bool);
    }
}