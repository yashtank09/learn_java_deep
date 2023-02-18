package Network_programming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* 
 * DOC: https://docs.oracle.com/javase/tutorial/networking/datagrams/index.html#:~:text=A%20datagram%20is%20an%20independent,independent%20datagram%20communication%20using%20UDP.
 */

public class DatagramClientEcho {
    public static void main(String[] args) {
        // sending data
        try (DatagramSocket dgs = new DatagramSocket(2001)) {
            
            String message = "Hello World!";
            DatagramPacket dp = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("localhost"),2000);

            dgs.send(dp);

            // create a new packet and recive data
            byte b[] = new byte[1024];
            dp = new DatagramPacket(b, 1024);
            dgs.receive(dp);

            // create string and display data
            message = new String(dp.getData()).trim();
            System.out.println("From server: "+message);

            dgs.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
