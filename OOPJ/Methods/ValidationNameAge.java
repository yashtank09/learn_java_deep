package Methods;

public class ValidationNameAge {

    static boolean validate(String name){
        return name.matches("[a-zA-z]+");
    }

    static boolean validate(int age){
        return age > 3 && age <= 15;
    }

    public static void main(String[] args) {
        
        System.out.println(validate(56));
        System.out.println(validate("YashTank"));

    }
}
