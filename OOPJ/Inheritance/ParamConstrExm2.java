package Inheritance;
/* 
 * Parameterized Super Constructor
 */
class rectangle{
    int length;
    int breadth;

    rectangle(){
        length = breadth = 1;
    }
    rectangle(int l, int b){
        length = l;
        breadth = b;
    }
}

class Cuboid extends rectangle{
    int height;

    Cuboid(){
        height=1;
    }

    Cuboid(int h){
        height = h;
    }

    Cuboid(int l, int b, int h){
        super(l,b); // It will execute Perent parameterised constructor of rectangle class and assigned value to properties
        height=h;
    }

    int volume(){
        return length*breadth*height;
    }
}

public class ParamConstrExm2 {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid();
        Cuboid cub2 = new Cuboid(5,5,5);
        
        // It will print only 1 because we dosen't give any parames. It will execute only non parameterised construtor which assign 1 to every properties.
        System.out.println(cub.volume());

        // It will print voluem based on given parameters.
        System.out.println(cub2.volume());
    }
}
