package Java_Generics;

/**
 * Generics Example
 * Generic Methods
 */
@SuppressWarnings("unchecked")
class GenMeth<T>{

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

public class GenericsExample4 {
    // generic methods
    public static<E> void show(E... list){ // can use variable argumetns, works for any number of argument
        for (E e : list) {
            System.out.println(e);
        }
    }
    // bounded methodsdd
    public static<E extends String> void showbounded(E... li){
        for (E e : li) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        /* 
        show(new String[]{"Hi", "Hello", "Bye!"});
        show(new Integer[]{10, 20, 30, 40});
        */
        show("Hello","Bye!", "Nop.");
        show(11, 12, 13, 14);

        // showbounded(10, 20, 30); // The method showbounded(E...) in the type GenericsExample4 is not applicable for the arguments (int, int, int)Java
        showbounded("Yash", "Chirag", "Bhavik"); // The method showbounded(E...) in the type GenericsExample4 is not applicable for the arguments (int, int, int)Java
    }
}