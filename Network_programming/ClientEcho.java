package Network_programming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
/**
 * InnerClientEcho
 */
public class ClientEcho {
    public static void main(String[] args) {
        try (Socket stk = new Socket("192.168.0.101",2000)) {
            
            BufferedReader keyBoard = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
            PrintStream ps = new PrintStream(stk.getOutputStream());

            System.out.println("Enter your request to the server...");
            
            String msg;
            do {
                msg = keyBoard.readLine();
                ps.println(msg);
                msg = br.readLine();
                System.out.println("From Server "+msg);
            } while (!msg.equals("dne"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
