package Collection_Framework;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

/** StringTokenizer class example
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/StringTokenizer.html
 *  - Ref: https://www.geeksforgeeks.org/stringtokenizer-class-in-java/
 */
public class StringTokenizerDemo {

    public static void main(String[] args) throws Exception {
        
        // StringTokenizer demo using simple String Data
        String s = "name=Yash;address=Junagadh;country=India;department=cse"; // data is 'token' and special charachter is 'delemeters' (\n is default delimeter)

        StringTokenizer st = new StringTokenizer(s, "=;");

        System.out.println("Tokenizer with sample String variable.");

        // displying all the tokens
        String str;
        while(st.hasMoreTokens()){
            str = st.nextToken();
            System.out.println(str);
        }

        // Reading tokens from external source
        FileInputStream fis = new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/digits.txt");
        byte[] b = new byte[fis.available()];

        fis.read(b);

        String data = new String(b);

        StringTokenizer file_st = new StringTokenizer(data, ",");

        String data_file;
        ArrayList<Integer> al = new ArrayList<>();
        while(file_st.hasMoreTokens()){
            data_file = file_st.nextToken();
            al.add(Integer.valueOf(data_file)); // As we using Integer object type so we need to use Integer.valueOf() method for converting to Integer
        }

        System.out.println(al);
        
    }
}