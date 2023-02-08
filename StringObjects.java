public class StringObjects {
    public static void main(String[] args) {
        
        String str1 = "Java Program";
        
        String str2 = new String("JAVA");

        char c[] = {'h','e','l','l','o'};

        String str3 = new String(c, 1, 3);

        byte b[] = {65,66,67,68,69};

        String str4 = new String(b, 0, 3);

        System.out.println(str4);   

        //-------------------------------------

        String str5 = "Java";
        String str6 = new String("Java"); // This will create new object in 'Heap'

        System.out.println(str5==str6);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
