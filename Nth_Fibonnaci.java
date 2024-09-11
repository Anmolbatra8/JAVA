//Must visit article :
// This problem's Editorial :


/*  Next Problems: 
1)Even Fibo Num Sum
https://www.geeksforgeeks.org/problems/even-fibonacci-numbers-sum1455/1

2) No. of digits of Fibonaci
https://www.geeksforgeeks.org/problems/number-of-digits2559/1


3) Fibonnaci Sum : https://www.geeksforgeeks.org/problems/fibonacci-sum1423/1

*/


public class Main {
  
  /*
  Naive approach 
  simply returning last element after storing fibonnaci numbers till n
  unnecessary array storing creates O(n) space complexity
  
  */
  // ASSUMING SERIES STARTS FROM 1 ,1 as first two numbers
  
  public static int nthfibo(int n) {
  int[] ans = new int[n];
  ans[0] = 1;
  
  if(n == 1)
  return ans[0];
  
  ans[1] = 1;
  if(n ==2)
  return ans[1];
  
  
  for(int j = 2;j < n;j++) {
  ans[j] = ans[j-1] + ans[j-2];
  
  }
  return ans[n-1];
  
  }
  
  /*
  more space effcient function (O(1)) .Cause no need to store the whole array of fibonnaci numbers
  The position which user wants , it's previous two fibo nums are required only
  -so just reach at those numbers 
  with the help of loops
  */
  
  
  
  
  public static int nthFibonum(int N) {
  
 int a = 1;
 if(N ==1)
 return a;
 
 int b = 1;
 if(N == 2)
 return b;
 
 int fibo = 0;
 
 for(int i = 3;i <= N;i++) {
 fibo = a + b;
 a = b;
 b = fibo;
 }
 return b;
  
  }
  
  public static void main(String[] args) {
  
      System.out.println("Using simple Approach : \n");
  
      int res = nthfibo(8);
      System.out.println(res +"\n \n");

      System.out.println("Using Space optimised Approach : \n");

      int res2 = nthFibonum(8);
      System.out.println("\n"+res2);
      
  }
}
