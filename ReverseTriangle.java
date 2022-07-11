public class ReverseTriangle {
    public static void main(String[] args) {
        String x = "*";

        for(int i=1; i<=5; i++){
            for(int j=4; j>=i; j--)
                System.out.print(x);
            System.out.println();
            System.out.println();
        }
    }
}
