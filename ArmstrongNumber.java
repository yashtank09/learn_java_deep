
public class ArmstrongNumber {
    public static void main(String[] args) {
        int sum=0, reversed, numb=153;
        int numb2=numb, rev=0;
        // while(numb>0){
        for(int i=0;numb>0;i++){
            reversed = numb % 10;
            rev = rev * 10 + reversed;
            sum = sum + reversed*reversed*reversed;
            numb = numb/10;
        }
        if(sum == numb2){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
        System.out.println("Reverse: "+rev);
    }
}
