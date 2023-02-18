package Network_programming;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* 
 * https://docs.oracle.com/javase/tutorial/networking/datagrams/index.html#:~:text=A%20datagram%20is%20an%20independent,independent%20datagram%20communication%20using%20UDP.
 */

public class DatagramServerEcho {
    public static void main(String[] args) {
        try (DatagramSocket dgs = new DatagramSocket(2000)) {

            // DatagramPacket for reciving packet
            byte b[] = new byte[1024];
            DatagramPacket dp = new DatagramPacket(b, 1024);
            dgs.receive(dp);

            // creating string and reverse it
            String message = new String(dp.getData()).trim();
            System.out.println("From client: "+message);
            StringBuilder sb = new StringBuilder(message);
            sb.reverse();
            message = sb.toString();
            
            // for sending it to the client we need DatagramPacket
            dp = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName("localhost"),2001);

            dgs.send(dp);
         
            dgs.close();

        } catch(Exception e){
            System.out.println(e);
        }
    }
}
