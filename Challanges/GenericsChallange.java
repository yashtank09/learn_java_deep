package Challanges;

/**
 * GenericsChallange
 */
class Printer {
	<T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}
}
public class GenericsChallange {
    
    /* public static <T> void printArray(T[] array){
        for(T e: array){
            System.out.println(e);
        }
    } */
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        // P p = new P();
        // String[] strings = {"Hello", "World"};
        // int[] integers = {1,2,3};
        // p.printer(integers);
        // printArray(integers);
        // printArray("Hello","World");
    }
}