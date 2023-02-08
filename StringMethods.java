public class StringMethods {
    public static void main(String[] args) {

        String str = new String("netbeans"); // Java Strings are Immutable
        String str2 = "Hello World, This is Java!";
     
        // str = str.toUpperCase(); | str.trim(); | str.substring(3);

        System.out.println(str.length()); // return integer 4
        
        System.out.println(str.toUpperCase()); // Strings are immutable always new objecct will create if modifications are require.
        
        System.out.println(str2.trim()); // Removes blank spaces
        
        System.out.println(str2.substring(2, 9)); // Return new sub string
        
        System.out.println(str2.substring(6));
        // String str3 = str.replace('n', 'M');
        // System.out.println(str3);
        System.out.println(str2.replace('o', 'k')); // replace oldchar with newchar

        // ---- More Exp.

        String li = "Mr. Akshay Kumra";
        String ss = "www.linkedin.co.in";

        System.out.println(li.startsWith("Mr.")); // **Case Sensitive
        System.out.println(li.startsWith("sha",4));
        
        System.out.println(li.charAt(6));

        System.out.println(ss.contains(".co"));
        System.out.println(ss.split("@"));

        System.out.println(li.concat(ss));

        System.out.println(ss.indexOf("."));
        System.out.println(ss.indexOf("linked"));
        System.out.println(ss.indexOf(".",4));
        
        System.out.println(ss.lastIndexOf("."));

        // ---- More Exp.

        String j = "JAVA";
        String j2 = "java";
        String j3 = "Python";
        String j4 = "Python";
        int as = 12345;

        System.out.println(j.equals(j2));
        System.out.println(j3.equals(j4));
        System.out.println(j3.equals(j4.equals(j3)));
        System.out.println(j.equalsIgnoreCase(j2));

        System.out.println(j2.compareTo(j3)); // Fisrt String is smaller then next string return -1
        System.out.println(j3.compareTo(j2)); // Fisrt String is smaller then next string return difference between assci codes
        System.out.println(j.compareToIgnoreCase(j2));

        System.out.println(String.valueOf(as));

        // For practicing REGULAR EXPRESSIONS: https://regexr.com/

    }
}
