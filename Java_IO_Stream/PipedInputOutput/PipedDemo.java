package Java_IO_Stream.PipedInputOutput;
/* 
 * Pipied input and ouput stream example using Thread intercommunication
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

// producer which will produce/write the data
class producer extends Thread{
    OutputStream os;

    public producer(OutputStream o) {
        os=o;
    }

    public void run(){
        int count = 1;

        while(true){
            try {
                os.write(count);
                os.flush();
                System.out.println("Producer: " + count);
                Thread.sleep(10);
                count++;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

// consumer which will read/consume the data
class consumer extends Thread{
    InputStream is;

    public consumer(InputStream i) {
        is=i;
    }

    public void run(){
        int x;

        while(true){
            try {
                x = is.read();
                System.out.println("Consumer: " + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class PipedDemo {
    public static void main(String[] args) {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pos = new PipedOutputStream();

        try {
            pis.connect(pos); // piping tow streams with .connect() method
        } catch (IOException e) {
            e.printStackTrace();
        }

        producer p = new producer(pos); // produecer produce value so uses PipedOutputStream()
        consumer c = new consumer(pis); // consumer consume value so uses PipedInputStream()

        p.start();
        c.start();
    }
}
