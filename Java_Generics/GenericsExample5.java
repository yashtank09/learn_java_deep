package Java_Generics;

/*  Do & Dont's in generics
 *      - Only extends is allowed in generic class definition
 *      - extends is used for interface also.
 *      - extends from only one class and multiple interfaces
 *      - extends and super are allowed with <?> in methods
 *      - <?> will accept all types but cannot access
 *      - Base type of an object should be a same or?
 */
class A{}
interface B{}
interface C{}

class TestGen extends A implements B, C{

}

@SuppressWarnings("unchecked")
// class MyGenMeth<T extends A & B & C>{ // here we can use multiple arguments where first one will be class or rest of the remaining are may they go to officies
class MyGenMeth<T>{

    // Array list of type <T>
    // We can not directly create generics array so we typecase it to Generics
    T list[] = (T[]) new Object[10];
    int length = 0;

    // get generic value and store it into list
    public void append(T val){
        list[length++] = val;
    }

    // displaying array objects
    public void displayData(){
        for(int i=0; i<length; i++){
            System.out.println(list[i]);
        }
    }
}


public class GenericsExample5 {

    // Generics Wildcard | This is wild card argument using <?>
    // Uppserbound means Use 'extends'
    // Lowerbound means Use 'super'
    public static void functionExam(MyGenMeth<? extends/* super */ String> obj){
        obj.displayData();
    }

    public static void funfoo(MyGenMeth<?> ob){
        // ob.append("Hello!");
        ob.append(null); // only allow storeing null
    };
    public static void main(String[] args) {
        MyGenMeth<String> mgm = new MyGenMeth<>();

        mgm.append("Hii");
        mgm.append("Bye");

        MyGenMeth<Integer> mgm1 = new MyGenMeth<>();
        mgm1.append(100);
        mgm1.append(200);

        MyGenMeth<String> mgs = new MyGenMeth<>();

        mgs.append("Hello");
        mgs.append("Bye!");

        functionExam(mgm); // Take only String
        // functionExam(mgm1); // Take only Numbers
        functionExam(mgs); // Take only String

        MyGenMeth<String> mg = new MyGenMeth<>();

        funfoo(mg); 

        // - Base type of an object should be same or?
        MyGenMeth<String> genst1 = new MyGenMeth<String>();
        // MyGenMeth<Number> genst2 = new MyGenMeth<String>();
        // MyGenMeth<Integer> genst3 = new MyGenMeth<String>();
        MyGenMeth<?> genst4 = new MyGenMeth<String>(); // holding of an object
        // both argument generic class should be same
        // we can only storeing single datatype
    }
}
