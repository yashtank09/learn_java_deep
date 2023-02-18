package Network_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ReverseEcho
 */
public class ServerEcho extends Thread{

    // Using Multi-Trheading
    Socket stk;

    public ServerEcho(Socket st){
        stk = st;
    }

    @Override
    public void run() {
        try {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            System.out.println("Server is started...");
            System.out.println("Now you'll see every requeest/response.");
            
            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine(); // reading from client
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg); // sending message to client
                System.out.println("Message from client: "+msg);
            } while (!msg.equals("dne"));
            stk.close(); // cloasing stocket

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {
        try(ServerSocket ss = new ServerSocket(2000)){
            
        Socket sock;
        ServerEcho seh;
        int count=1;
            
        do {
            sock = ss.accept();
            System.out.println("Clitnet connected:"+count++);
            seh = new ServerEcho(sock);
            seh.start();
        } while (true);
            
        //Without thread
        /* BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            System.out.println("Server is started...");
            System.out.println("Now you'll see every requeest/response.");
            
            String msg;
            StringBuilder sb;
            do {
                msg = br.readLine(); // reading from client
                sb = new StringBuilder(msg);
                sb.reverse();
                msg = sb.toString();
                ps.println(msg); // sending message to client
                System.out.println("Message from client: "+msg);
            } while (!msg.equals("dne")); */

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}