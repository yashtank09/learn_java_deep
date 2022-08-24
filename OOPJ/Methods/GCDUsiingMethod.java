package OOPJ.Methods;
// Find greatest common divisor
/* 
 *  m = 25; n = 15
 *  m > n
 *  m = 25 - 15 = 10
 *  n > m
 *  n = 15 - 10 = 5
 *  m > n
 *  m = 10 - 5 = 5
 *  m == n
 *  return m;
 * 
 * 
 *  m > n
 *  >> m = m - n
 *  n > m
 *  >> n = n - m
 *  m == n
 *  >> return m
 */
public class GCDUsiingMethod {
    
    static int findGCD(int m, int n){
        
        while(m!=n){
        // for(int i=0; m!=n; i++){
            if(m>n){
                m = m-n;
            }else{
                n = n-m;
            }
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println(findGCD(24, 34));
    }
}
