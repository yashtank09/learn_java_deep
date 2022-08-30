package Methods;

public class VariableArguments {
    
    static void showList(int ...a){ // syntax for Variable arguments we can declare it using "{datatype} ...<variable Name>"
        for (int i : a) {
            System.out.println(i);
        }
    }

    static void showList(String ...names){
        for(int i=0; i<names.length; i++){
            System.out.println(i+1 + ". "+ names[i]);
        }
    }

    static void ShowNames(int count, String ...names){
        for(int i=0; i<names.length; i++){
            System.out.println(count + ". "+ names[i]);
            count++;
        }
    }
    
    public static void main(String ...args) { // Yes, we can use vararges in Main method argumetns also
    // public static void main(String[] args) {
        
        showList(1,2,4,6,7,3,6);
        
        System.out.println();
        showList(1,2);
        
        /* 
            int a[] = new int{} - here it elabrated below array
            but there is no referance of that array
            
            so it is an anonymous array that dosen't have any referance
            and it is created on fly, it means it's created for time being and utilised by the method and then delete it.

            In variable arguments we can pass an array object also.
         */
        System.out.println();
        showList(new int[]{2,4,6,3,2,6,7,8,4,3,234,56,47,8,});
        
        System.out.println();
        showList("Yash", "Aayushi", "Aastik", "Darshan", "Akash", "Aditiss");
        
        System.out.println();
        ShowNames(101,"Yash", "Aayushi", "Aastik", "Darshan", "Akash", "Aditiss");
    }
}
