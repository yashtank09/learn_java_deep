// Unicode is a standard for the consistent encoding, representation, and handling of text expressed in most of the world's writing systems.
// Unicode supports many languages like tamil, chines, gujarati, telegu, hindi, spanish etc.
public class Unicode {
    public static void main(String[] args) {
        char x = 0x0370;
        System.out.println(x);

        // Here we are printing devangiri from unicode.org
        for(char c=0x0900;c<=0x0970;c++ ){
            System.out.print(c+" ");
        }
    }
}
