/**
 * if else if ladder
 * 
 * if(_condition_){
 *      statement
 * }
 * else if(_condition_){
 *      statement
 * }
 * else if(_condition_){
 *      statement
 * }else{
 *      statement
 * }
 * 
 */
class ledderif{
    int checknumber = 0;
    ledderif(int checknumber){
        this.checknumber = checknumber;    
    }
    //private void numcheck(): if we write this method with private it will give an error
    public void numcheck(){
    
        if(checknumber >= 0 && checknumber <= 10){
            System.out.println(checknumber + " is between 0 & 10.");
        }
        else if(checknumber >= 11 && checknumber <= 15){
            System.out.println(checknumber + " is between 11 & 15.");
        }
        else if(checknumber >= 16 && checknumber <= 20){
            System.out.println(checknumber + " is between 16 & 20.");
        }
        else{
            System.out.println(checknumber + " is greaterthan 20.");
        }
    }
}
public class ifelseif_ladder {
    public static void main(String[] args) {
        ledderif lif = new ledderif(18);
        lif.numcheck();
    }
}