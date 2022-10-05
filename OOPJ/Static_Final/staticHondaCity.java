package Static_Final;

class HondaCity{
    
    // static datamember
    static long price = 10; // This datamember is availalbe and same for every object created even modified the value will be changed for every object
    int a, b;

    static double onRoadPrice(String City){
        switch(City){
            case "Delhi":
                return price + price * 0.1;
            case "Mumbai":
                return price + price * 0.9;
            default:
                return 0;
        }
    }
}

public class staticHondaCity {
    public static void main(String[] args) {
        // Here is the example of static data member of a class
        // Calling static method of class
        System.out.println(HondaCity.onRoadPrice("Delhi"));
        // Calling static datamember of class without creating an object
        System.out.println(HondaCity.price);
    }    
}
