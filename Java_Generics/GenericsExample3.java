package Java_Generics;

/**
 * Generics Example 3
 *  - create generic type Array
 */

@SuppressWarnings("unchecked")
// we can also give multiple parameters as generics which are mostily used for Key, Value pair
// class gen_data<T,K>{
class gen_data<T>{

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

// extending generic class so this child class also be generic. If type is not mentioned it will be Object type.
class gen_data_update extends gen_data<String>{
    // Now gen_data_update is extended from gen_data_update will only accept String values

}

// create child generic
class gen_data_3<T> extends gen_data<T>{
    // if perent use generic type, child should also be generic class
}

// Bounded types in generics
class gen_data_bounded<T extends Number>{
    // Number is non-primitive datatype which is holding float, int, byte, short etc.
    // After bounding it we can oly use those types of values as generic parameter
    // we can also extends our own class or Interface(for generics we only extends interface)
}

public class GenericsExample3 {
    public static void main(String[] args) {
        
        // Generic class object using Integer
        gen_data<Integer> gdI = new gen_data<>();
        gdI.append(10);
        gdI.append(20);
        gdI.append(30);
        gdI.append(40);

        gdI.displayData();

        // Generic class object using String
        gen_data<String> gdS = new gen_data<>();
        gdS.append("Hello!");
        gdS.append("Hii!");
        gdS.append("Bye!");

        gdS.displayData();
 
        // - creating instance without generics parameter
        /*
            gen_data gd = new gen_data();

            gd.append(10);
            gd.append(20);
            gd.append("Hi!");
            gd.append("Bye!");
        */

        // Multiple parameters in generics
        /* 
            gen_data<String, Integer> gd = new gen_data();
            gd.append("Yash");
            gd.append("Jay");
            gd.append("Veer");
         */

         // Extended class which became generic
         // here this object only take String
         gen_data_update gdu = new gen_data_update();
         gdu.append("Yash");
         gdu.append("Jay");
         gdu.append("Veer");

         // Child became generic type
         gen_data_3<Integer> gd3 = new gen_data_3<>();
         gd3.append(10);
         gd3.append(20);
         gd3.append(30);

         // bounded generic type object
         gen_data_bounded<Short> gdb = new gen_data_bounded<>();
         gen_data_bounded<Float> gdb1 = new gen_data_bounded<>();
         gen_data_bounded<Byte> gdb2 = new gen_data_bounded<>();
         gen_data_bounded<Integer> gdb3 = new gen_data_bounded<>();
         gen_data_bounded<Double> gdb4 = new gen_data_bounded<>();
        //  gen_data_bounded<String> gdb5 = new gen_data_bounded<>(); can not use String because generics extends Number class

    }    
}
