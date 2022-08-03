public class palindromeNumber {
    public static void main(String[] args) {
        int r, n=16561;
        int m=n, rev=0;
        while(n>0){
            r = n % 10;
            rev = rev * 10 + r;
            n = n/10;
        }
        if(m==rev){
            System.out.println("Number is Palindromic number.");
        }else{
            System.out.println("Number is not Palindromic number.");
        }
    }
}
