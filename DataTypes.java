public class DataTypes {
    public static void main(String[] args) {
        // byte | size: 1 byte, 8 bits | -128 to 127(Range)
        //This is called Variable with initial value.
        // Here 'b' is variable and 'byte' is datatype.
        byte b = 5;
        System.out.println("byte DataType: "+ b);
        System.out.println("Minimum Value: " + Byte.MIN_VALUE);
        System.out.println("Max Value: " + Byte.MAX_VALUE);
        System.out.println("Size: " + Byte.BYTES + "\n");

        // short | size: 2 byte, 16 bits | -32768 to 32767(Range)
        short s = 400;
        System.out.println("short DataType: "+ s);
        System.out.println("Minimum Value: " + Short.MIN_VALUE);
        System.out.println("Max Value: " + Short.MAX_VALUE);
        System.out.println("Size: " + Short.BYTES + "\n");

        // int | size: 4 byte, 32 bits | -2147483648 to 2147486947(Range)
        int i = 320000;
        System.out.println("int DataType: "+ i);
        System.out.println("Minimum Value: " + Integer.MIN_VALUE);
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Size: " + Integer.BYTES + "\n");

        // long | size: 8 byte, 64 bits | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long l = 2048548125;
        System.out.println("long DataType: "+ l);
        System.out.println("Minimum Value: " + Long.MIN_VALUE);
        System.out.println("Max Value: " + Long.MAX_VALUE);
        System.out.println("Size: " + Long.BYTES + "\n");
        
        // float(decimal numbers) | size: 4 byte, 32 bits | 3.40282347 x 10^38, 1.40239846 x 10^-45
        float f = 1.5f;
        System.out.println("float DataType: "+ f);
        System.out.println("Minimum Value: " + Float.MIN_VALUE);
        System.out.println("Max Value: " + Float.MAX_VALUE);
        System.out.println("Size: " + Float.BYTES + "\n");

        // doubble | size: 8 byte, 64bits | 1.7976931348623157 x 10^308, 4.9406564584124654 x 10^-324
        double d = 25.65;
        System.out.println("double DataType: "+ d);
        System.out.println("Minimum Value: " + Double.MIN_VALUE);
        System.out.println("Max Value: " + Double.MAX_VALUE);
        System.out.println("Size: " + Double.BYTES + "\n");

        // char | size: 2 byte, 16 bits | 0 to 65535
        char c = 'A';
        System.out.println("char DataType: "+ c);
        System.out.println("Minimum Value: " + Character.MIN_VALUE);
        System.out.println("Max Value: " + Character.MAX_VALUE);
        System.out.println("Size: " + Character.BYTES + "\n");

        // boolen | Default value: true/false(1/0) |size:  byte | 0 to 65535
        boolean bool = true;
        System.out.println("boolean DataType: "+ bool);
        System.out.println("Boolean have predefine constant 'True' or 'False'");
        
        /*
            --------Rules for datatypes--------
            1. Case Sensitive                                      |    int amt; int Amt; This is give an error[int x; float x;] Allowed[int x; float X;]
            2. Contains Alphabet, _, $                             |    int room2; char room_name; float Total$amount; 
            3. Starts with Alphabet, _, $                          |    {char 25cb;}is not allowed, char cb25; is allowed
            4. Should not be a keyword                             |    more than 48 keyword have java
            5. Should not be a class name, if class is also in use |    Aboid that that's not propper
            6. No limit on length of name                          |
            7. Follow Camel Cases                                  |    rollNumber (This is camel cases variable)
        */

    }

}
