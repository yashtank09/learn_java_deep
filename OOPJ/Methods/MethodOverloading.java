package OOPJ.Methods;

/* 
    Method Overloading:
        - Writing morethan one method haveing same name but different parameters.
 */

public class MethodOverloading {
    
    // if we give 2 actual parameters of Integer values
    static int max(int x, int y){
        return x>y?x:y; // This is ternary operator | Condition ? <Condition True> statemetn : <condition False> statemetn;
    }

    /*  This is not allowed
        static int max(int x, int y){
            return x>y?x:y;
        }
    */

    // If we give 3 actual parameters of Integer values
    static int max(int x, int y, int z){
        return x>y?x:y;
    }

    // If we give 2 actual parameters of floating values
    static float max(float x, float y){
        return x>y?x:y;
    }

    // If we give 3 actual parameters of floating values
    static float max(float x, float y, float z){
        return x>y?x:y;
    }
    
    public static void main(String[] args) {
        System.out.println(max(44f,23f));
    }
}
