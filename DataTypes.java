public class DataTypes {
    public static void main(String[] args) {
        // byte | size: 1 byte, 8 bits | -128 to 127(Range)
        //This is called Variable with initial value.
        // Here 'b' is variable and 'byte' is datatype.
        byte b = 5;
        System.out.println("byte DataType: "+ b);

        // short | size: 2 byte, 16 bits | -32768 to 32767(Range)
        short s = 400;
        System.out.println("short DataType: "+ s);

        // int | size: 4 byte, 32 bits | -2147483648 to 2147486947(Range)
        int i = 320000;
        System.out.println("int DataType: "+ i);

        // long | size: 8 byte, 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 2048548125;
        System.out.println("long DataType: "+ l);
        
        // float(decimal numbers) | size: 4 byte, 32 bits | 3.40282347 x 10^38, 1.40239846 x 10^-45
        float f = 1.5f;
        System.out.println("float DataType: "+ f);

        // doubble | size: 8 byte, 64bits | 1.7976931348623157 x 10^308, 4.9406564584124654 x 10^-324
        double d = 25.65;
        System.out.println("double DataType: "+ d);

        // char | size: 2 byte, 16 bits | 0 to 65535
        char c = 'A';
        System.out.println("char DataType: "+ c);

        // boolen | Default value: true/false(1/0) |size:  byte | 0 to 65535
        boolean bool = true;
        System.out.println("boolean DataType: "+ bool);
    }

}
