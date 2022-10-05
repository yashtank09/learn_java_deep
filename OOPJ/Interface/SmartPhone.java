package Interface;

class Phone{
    public void call(){
        System.out.println("Phone call");
    }
    public void sms(){
        System.out.println("Phone sending SMS");
    }
}

interface ICamara{
    void click();
    void record();
    
    // If we want to define body of any method in an interface method must be 'static', but we can not override it where we implements this interface.
    static void panoramaMode(){
        System.out.println("Chaning to Panorama Mode.");
    }
}

interface IMusicPlayer{
    void play();
    void stop();
}
/* 
    Interface.InnerSmartPhone
    The type InnerSmartPhone must implement the inherited abstract method IMusicPlayer.play()Java(67109264)
    The type InnerSmartPhone must implement the inherited abstract method ICamara.click()Java(67109264)
    The type InnerSmartPhone must implement the inherited abstract method ICamara.record()Java(67109264)
    The type InnerSmartPhone must implement the inherited abstract method IMusicPlayer.stop()Java(67109264)
    -- if we are not overriding method of interface 'ICamara' & 'IMusicPlayer'.
 */
class InnerSmartPhone extends Phone implements ICamara, IMusicPlayer{
    
    // Extra Method of this class
    public void videoCall(){
        System.out.println("Smart Phone video calling.");
    }
    
    // -- Interface 'ICamara'
    @Override
    public void click(){
        System.out.println("Smart Phone clicking PIC.");
    }
    @Override
    public void record(){
        System.out.println("Smart Phone recording Video.");
    }
    /* 
    -- Can not override static method of an Interface
    @Override
    public void panoramaMode(){
        System.out.println("Change this.");
    } 
    */

    // -- Interface 'IMusicPlayer'
    @Override
    public void play(){
        System.out.println("Smart Phone playing Music.");
    }
    @Override
    public void stop(){
        System.out.println("Smart Phone stoping Music.");
    }
}

/**
 * This is an example of an 'interface'
 */
public class SmartPhone {
    public static void main(String[] args) {

        // Here, we are creating an object of the class 'InnerSmartPhone'.
        InnerSmartPhone ISP = new InnerSmartPhone();
        // Calling every method of the class 'InnerSmartPhone'.
        System.out.println("This is 'InnerSmartPhone' class methods are calling.");
        ISP.videoCall();
        ISP.click();
        ISP.record();
        ISP.play();
        ISP.stop();

        System.out.println("\n\nThis is referance of 'class Phone' holding object of 'class InnerSmartPhone'.");
        // 'PC' is referance of a 'class Phone' and assiging an object of a 'class InnerSmartPhone'. 
        Phone PC = new InnerSmartPhone();
        PC.call();
        PC.sms();
        // But we can call only those methods which are defined in 'class Phone'.

        // Now, we are creating a referance of an interface 'ICamara' and assiging class InnerSmartPhone object.
        ICamara IC;
        IC = new InnerSmartPhone();
        System.out.println("\n\nThis is 'ICamara' referance calling method of ICamara interface using object of 'InnerSmartPhone'.");
        IC.click();
        IC.record();
        // IC.panoramaMode(); -- Can not call static method by the referance of the interface, but we can call it using name of the interface
        System.out.println("\n\nCalling static method of an interface.");
        ICamara.panoramaMode();
        // Insted of every method of 'InnerSmartPhone class' we can only call overrided method of 'ICamara interface'.

        // Now, we are creating a referance of an interface 'IMusicPlayer' and assiging class InnerSmartPhone object.
        IMusicPlayer IMP;
        IMP = new InnerSmartPhone();
        System.out.println("\n\nThis is 'IMusicPlayer' referance calling method of ICamara interface using object of 'InnerSmartPhone'.");
        IMP.play();
        IMP.stop();
        // Insted of every method of 'InnerSmartPhone class' we can only call overrided method of 'ICamara interface'.
    }
}
