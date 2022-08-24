package OOPJ.Methods;

public class FindMaxArrayMethod {
    
    static int FindMax(int[] a){
        
        int maxEle = a[0];
        for(int i=0; i < a.length; i++){
            if(a[i]> maxEle){
                maxEle = a[i];
            }
        }        
        return maxEle;
    }
    
    public static void main(String[] args) {
        int[] s = {22, 44, 31, 76, 21, 9, 91, 10, 11};
        System.out.println(FindMax(s));
    }
}
