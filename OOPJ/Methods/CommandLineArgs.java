package OOPJ.Methods;

public class CommandLineArgs {
	public static void main(String args[]){
		//if(args.length==0){
		//	System.out.println(Integer.MIN_VALUE);
		//}
		
		//try {
            for(String s: args){
               Double.parseDouble(s);
				System.out.println(s);
			}
        /*} catch (ArrayIndexOutOfBoundsException e) {
                //TODO: handle exception
			System.out.println("Please give any Arguments and sole this: "+e);
        }*/


        /*
            args is a referance of String array
            we will se it like this in command line
            c:>javac CommandLineArgs.java

            c:>java CommandLineArgs Yash Hello how are you
            Yash
            Hello
            how
            are
            you
         */
	}
}