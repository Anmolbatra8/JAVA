public class Main {
 /*
 'n' input
 if (n > 1): return (n* fact(n-1))
 else : return 1
 
 
 */

 public static int facto(int num) {
 /*
 Time Complexity: O(n)
Auxiliary Space: O(1)
 */
 
 int result = 1;
 if(num == 0) {
 return 1;
 }
 
 for(int i = num;i >= 1;i--) {
   result *= i;
 }
 return result;

 }
 
 public static long fact(int num) {
 /*
 Time Complexity: O(n)
Auxiliary Space: O(n)
 */

  if(num > 1) {
  return(num*fact(num-1));
  }
  else {
  return 1;
  }  
 }
 
 public static int onelinefact(int num) {
 return((num > 1) ? (num*fact(num-1)) : 1);
 }
 
 public static void main(String[] args) {
   System.out.println("Using Recursive Function: "+facto(-7));
System.out.println("Function using Multiplication: "+ facto(6));
    }  
  
}
/* After this , find big numbers factorial by learning from this link :  https://www.geeksforgeeks.org/factorial-large-number/  */
