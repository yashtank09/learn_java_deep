package OOPJ;

//Creating java class for calculator which is in OOPJ package
public class calculatorClass {
    private double value1, value2;

    public calculatorClass(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public double addition(){ 
        return value1 + value2; 
    }
    public double substraction(){ 
        return value1 - value2; 
    }
    public double multiplication(){ 
        return value1 * value2;
    }
    public double division(){ 
        return value1 / value2;
    }
 
}
