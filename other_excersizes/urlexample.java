package other_excersizes;
import java.net.*;   
public class urlexample {   
    public static void main(String[] args){    
    try{    
        URL url=new URL("https://www.udemy.com");    
        System.out.println("Protocol: "+url.getProtocol());// Using getProtocol() method of the URL class  
        System.out.println("Host Name: "+url.getHost()); // Using getHost() method   
        System.out.println("Port Number: "+url.getPort());  // Using getPort() method  
        System.out.println("File Name: "+url.getFile());    //Using getFile() method  
        }  
        catch(Exception e){
            System.out.println(e);
        }
    }
}