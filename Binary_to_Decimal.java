public class Main {
 /*
 
 ->get each bit
 ->if that is 1 , then add 2^ i(th) position to ans variable
 
 */
 
 public static void bintodec(int num) {
     int ans = 0;
    int pos = 0;
    int bit;
    while(num > 0) {
    bit = num & 1;
    if(bit == 1) {
    ans += bit << pos ; 
     // 2 to the power using left shift
      // more faster than pow
     }
      /* 
     Optional:
     ans +=  (num & 1) << 1;
     Elimination of "if" condition can improve
     and simplify the logic
     */
     num = num >> 1;
 //right shift 1 equivalent to dividing by 2 , but faster than arithmetic
     pos++;
    }
    System.out.println(ans);
    }
  
  public static void main(String[] args) {
 int ques = 0b1010;
   bintodec(ques);
   
  }
}
