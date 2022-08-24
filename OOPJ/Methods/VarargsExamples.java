package OOPJ.Methods;

public class VarargsExamples {
    // Maximum of Numbers using Varargs
    static int findMax(int ...a){
        if(a.length==0) return Integer.MIN_VALUE;
        
        int firstMax=a[0];
        for(int i=0; i<a.length;i++){
            if(a[i] > firstMax)
                firstMax = a[i];
        }
        return firstMax;
    }

    // Sum of all elements using varargs
    static int sumofAll(int ...digits){
        int sum = 0;
        for(int i=0; i<digits.length; i++){
            sum+=digits[i];
        }
        return sum;
    }

    // Caluculate discount rate using varargs
    static double rateDiscount(double rate, double ...prices){
        double sum = 0;
        for(int i=0; i<prices.length; i++){
            sum+=prices[i];
        }
        return (sum*rate)/100;
    }

    static double rateDiscountSecond(double ...prices){
        double sum = 0, discount = 0;
        for(int i=0; i<prices.length; i++){
            sum+=prices[i];
        }
        if(sum<400){
            discount = 5;
        }else if(sum>400 && sum<=800){
            discount = 10;
        }else if(sum>800 && sum<=1600){
            discount = 25;
        }else if(sum>1600 && sum<3200){
            discount = 50;
        }
        return(sum*discount)/100;
    }

    public static void main(String[] args) {
        System.out.println(findMax());
        System.out.println("Discount Rs. "+rateDiscountSecond(120,340,580));
        System.out.println("Max element: "+ findMax(22, 44, 31, 76, 21, 9, 91, 10, 11));
        System.out.println("Sum of all digits: "+ sumofAll(22, 44, 31, 76, 21, 9, 91, 10, 11));
        System.out.println("Discount on price: "+ rateDiscount(25, 100, 200, 400, 300));
    }
}
