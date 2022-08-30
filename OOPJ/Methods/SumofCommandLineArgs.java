package Methods;

public class SumofCommandLineArgs {
    public static void main(String[] args) {
        double sumall = 0;
		for(int i=0;i<args.length; i++){
			if(args[i].matches("[0-9\\.]+"))
				sumall += Double.parseDouble(args[i]);
		}
		System.out.println(sumall);

		/* 
		OUTPUT:

		 	c:>javac SumofCommandLineArgs.java
			c:>java SumofCommandLineArgs 20 30 40 50
			140
			c:>java SumofCommandLineArgs Y J K
				~ nothing will print
		 */
    }
}
