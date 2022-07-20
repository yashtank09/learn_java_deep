package RegexPractice;
import java.util.*;
import java.util.regex.*;
/*
 * We are using Matcher class that is
 * An engine that performs match operations on a character sequence by interpreting a Pattern.
 */
public class TagContentExtractor{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases-->0){
			String line = in.nextLine();
			String reg = "<(.+)>(([^<>]+))</\\1>";
          	//Write your code here
			Matcher m = Pattern.compile(reg).matcher(line);
            
            if(!m.find()){
                System.out.println("None");
                continue;
            }
            
            m.reset();
            while(m.find()){
                System.out.println(m.group(2));
            }
			
		}
	}
}



