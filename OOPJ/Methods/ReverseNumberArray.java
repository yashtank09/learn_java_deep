package Methods;

public class ReverseNumberArray {
    
    static int reverse(int numb){
        int reverse=0;
        while(numb>0){
            reverse = reverse * 10 + numb % 10;
            numb = numb / 10;
        }
        return reverse;
    }

    static int[] reverse(int a[]){
        
        int b[] = new int[a.length];

        for(int i=a.length-1, j=0;i>=0;i--,j++)
            b[j] = a[i];

        return b;
    }
    
    public static void main(String[] args) {
        int a = 765;
        int[] b = {78, 23, 11, 56, 23, 99};
        
        System.out.println("Reversed number = "+reverse(a));

        for (int i : reverse(b)) {
            System.out.print(i+" ");
        }
    }
}
