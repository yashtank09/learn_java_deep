package JavaLangPackage;

public class CharachterAndBooleanWrapper {
    public static void main(String[] args) {
        /*           Charachter           */
        Character a = 'A';
        Character b = 'a';

        System.out.println(Character.toLowerCase(a));
        System.out.println(Character.toUpperCase(b));
        System.out.println(Character.isLetter(a));

        // When ever you wnat to working with charachter you can use every methods

        /*           Boolean           */
        Boolean bool = true;

        System.out.println(bool.getClass());
        
        System.out.println(Boolean.FALSE);
        System.out.println(Boolean.TRUE);
    }
}
