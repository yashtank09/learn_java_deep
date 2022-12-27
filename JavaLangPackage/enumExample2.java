package JavaLangPackage;
/* 
 * Enums Example 2:
 *      - 'enum' is keyword and automatically inheriting from 'Enum class'
 *      - 'Enum class' is present inside java.lang.Enum;
 *      - enum can also have constructor
 *      - enum constructor should be private or default
 *      - every time enum is loaded every constunt will be created and their constructor will be called
 *      - 
 */

enum Dept{
    CS, IT, CIVIL, ECE;

    // enum constructor 
    private Dept(){
        System.out.println(this.name());
    }

    // enum can have public method
    public void display(){
        System.out.println(this.name() + " " + this.ordinal());
    }
}

enum dificulties{
    
    LOW(20), MEDIUM(40), HIGH(60), DEFFICULT(80);
    
    int d;
    private dificulties(int d){
        this.d = d;
    }

    public int levels(){
        return d;
    }

}

public class enumExample2 {
    public static void main(String[] args) {
        
        // enum object with specific constant name
        Dept d = Dept.CIVIL;   // here we can not assign any other values.
        
        System.out.println(d.ordinal()); // it will return index order of each constant
        System.out.println(Dept.valueOf("ECE")); // showing value of enum given as parameter and it shoudl be in capital case

        d.display(); // Output: CIVIL 2 - object is have CIVIL constant
        
        // Arrays of enum values
        Dept list[] = Dept.values(); // .values() method will return array of enums

        for(Dept x: list){
            System.out.println(x);
        }

        // switch case example using enums
        Dept d2 = Dept.ECE;

        switch(d2){
            case CS:
                System.out.println("Head: John \nBlock: A");
                break;
            case IT:
                System.out.println("Head: Smith \nBlock: B");
                break;
            case CIVIL:
                System.out.println("Head: Srinivas \nBlock: C");
                break;
            case ECE:
                System.out.println("Head: Dave \nBlock: D");
                break;
        }

        // enum with default values constructor
        dificulties df = dificulties.MEDIUM;

        System.out.println(df.name()+ " " +df.levels()); // it will return value of given constant

    }
}
