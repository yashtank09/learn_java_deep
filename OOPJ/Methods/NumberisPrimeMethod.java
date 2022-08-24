package OOPJ.Methods;

public class NumberisPrimeMethod {
    static boolean isprime(int p){
        
        for(int i=2; i < p/2; i++){
            if(p % i == 0)
                return false;
        }
        return true;
        
    }
    public static void main(String[] args) {
        int prime = 91;
        if(isprime(prime)){
            System.out.println("Number is Prime number.");
        }
        else{
            System.out.println("Number is not Prime number.");
        }
    }
}
