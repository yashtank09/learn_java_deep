package Collection_Framework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

/** Properties class example 
 *  - Doc: https://docs.oracle.com/javase/8/docs/api/java/util/Hashtable.html
 *  - Ref: https://www.geeksforgeeks.org/priority-queue-class-in-java/
 */

public class PropertiesDemo {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();

        // properties are (Key<String>, Value<String>) pair
        p.setProperty("Brand", "HP");
        p.setProperty("Processor", "Ryzen 5");
        p.setProperty("OS", "Windows 10");
        p.setProperty("Model", "Latitude");

        System.out.println(p);

        // for storing this Properties to any file
        p.store(new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/MyLaptopData.txt"), "Laptop");
        p.storeToXML(new FileOutputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/MyLaptopData.xml"), "Laptop");

        System.out.println("\nLoading XML file...");
        
        // Loading the external data
        // Loading xml data
        Properties load_xml = new Properties();

        // loadFromXML for loading XML data
        load_xml.loadFromXML(new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/MyProduct.xml"));

        System.out.println(load_xml);

        System.out.println("\nLoading Text file...");

        Properties load_txt = new Properties();

        // load() function for loading text based data
        load_txt.load(new FileInputStream("C:/Yash Stuff/MCA/learn_java_deep/Collection_Framework/PersonDetails.txt"));

        System.out.println(load_txt);
    }
}
