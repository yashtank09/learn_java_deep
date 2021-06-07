public class AssignmentOperator2 {
    public static void main(String[] args) {
        short a=10;
        short b=10;
        //a+=b; a=a+b internally so fine
        //a= a + b;   | Compile time error because 10+10=20 now int
        System.out.println(a);
        System.out.println(b);


        System.out.println("============");
        short x=10;
        short y=10;
        x=(short)(x+y); //20 which is int now converted to short
        System.out.println(x);
    }
}
