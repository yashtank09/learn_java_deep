package JavaLangPackage;

/* 
    || String vs. String Buffer vs. String Builder ||


    -- for other methods --
    String class: https://docs.oracle.com/javase/7/docs/api/java/lang/String.html 
    String Builder: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html 
    String Buffer: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html
 */

public class StringBufferBuilder {
    public static void main(String[] args) {
        
        String s = new String("Hello");

        StringBuilder s_build = new StringBuilder("Hello");

        StringBuffer s_buffer = new StringBuffer("Hello");

        s.concat("World!");

        s_build.append("World!");

        s_buffer.append("World!");

        System.out.println(s);
        
        System.out.println(s_buffer);

        System.out.println(s_build);
    }
}
