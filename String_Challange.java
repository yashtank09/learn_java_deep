public class String_Challange {
    public static void main(String[] args) {
        
        // String Challange 1
        String str = "programmer@gmail.com";

        int i = str.indexOf("@");
        
        String Domain = str.substring(i+1);
        String UserNm = str.substring(0, i);
        
        System.out.println("Domain: "+Domain);
        System.out.println("Username: "+UserNm);

        int j = Domain.indexOf(".");
        String name = Domain.substring(0, j);
        System.out.println(Domain.equals(name));

        // String Challange 2
        int b = 101010;
        // String str1 = b+"";
        String str1 = String.valueOf(b);
        System.out.println(str1.matches("[01]+"));

        // String Challange 3
        String str3 = "B234A";

        System.out.println(str3.matches("[0-9A-F]+"));

        // String Challange 4
        String str4 = "01/12/2000";
        System.out.println(str4.matches("[0-3][0-9]/[01][0-9]/[0-4]{4}"));

        // String Challange 5: Remove special charachter, extra space and find the number of space in a String
        String str5 = "a!B@c%1S#9Q012?";
        String str6 = "    abc iid    skja   asdk  we ";
        
        System.out.println(str5.replaceAll("[^a-zA-Z0-9]", ""));
        
        String st = str6.replaceAll("\\s+", " ").trim();
        String words[] = st.split("\\s");
        System.out.println(words.length);

        String digits = str5.replaceAll("\\D", "");
        System.out.println("Count of digit in str5 is: "+digits+" "+digits.length());
    }
}
