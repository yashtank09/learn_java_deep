import java.util.Scanner;

public class conditionalStatements {
    public static void main(String[] args) {
        int n = -1;

        if(n>=0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }

        // Multiple if and else statemetn
        System.out.println("\n- Multiple if Statemetns -\n");

        int a=5, b=15, c=4;

        if(a>b && a>c){
            System.out.println(a);
        }
        else if(b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        // Nested if and else statemetn
        System.out.println("\n- N ested if Statemetns -\n");

        // conditional statement challange

        // __ Number is even or odd

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter an Integer Number: ");
        int Numb = sc.nextInt();

        if(Numb % 2 == 0){
            System.out.println("Number " + Numb + " is Even Number.\n\n");
        }else{
            System.out.println("Number " + Numb + " is Odd Number.\n\n");
        }

        // __ Find a person is Younger or Older using age
        System.out.println("Enter Age: ");
        int age = sc.nextInt();

        if(age<=5){
            System.out.println("Baby");
        }else if(age > 5 && age <= 18){
            System.out.println("Teenager");
        }else if(age > 18 && age <= 26){
            System.out.println("Adult");
        }else if(age > 26 && age <= 58){
            System.out.println("Man");
        }else{
            System.out.println("Old Age");
        }
        System.out.println();
        System.out.println();

        // __ Find Grade for given marks
        int sub1, sub2, sub3, sub4, sub5, sub6, TotalMarks;

        System.out.println("Enter Marks for Subject 1: ");
        sub1 = sc.nextInt();
        System.out.println("Enter Marks for Subject 2: ");
        sub2 = sc.nextInt();
        System.out.println("Enter Marks for Subject 3: ");
        sub3 = sc.nextInt();
        System.out.println("Enter Marks for Subject 4: ");
        sub4 = sc.nextInt();
        System.out.println("Enter Marks for Subject 5: ");
        sub5 = sc.nextInt();
        System.out.println("Enter Marks for Subject 6: ");
        sub6 = sc.nextInt();

        TotalMarks = sub1 + sub2 + sub3 + sub4 + sub5 + sub6;

        float Avrage = (float)TotalMarks/6;

        sc.close();

        System.out.printf("Avrage: %.2f\n", Avrage);

        if(Avrage>=95){
            System.out.println("Grade A+");
        }else if(Avrage < 95 && Avrage >= 80){
            System.out.println("Grade A");
        }else if(Avrage < 80 && Avrage >= 70){
            System.out.println("Grade B");
        }else if(Avrage < 70 && Avrage >= 55){
            System.out.println("Grade C");
        }else if(Avrage < 55 && Avrage >= 35){
            System.out.println("Grade E");
        }else{
            System.out.println("Sorry! You are Fail.");
        }
    }
}
