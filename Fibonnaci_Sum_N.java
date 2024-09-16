public class Main {
  //NOT YET ABLE TO ACHIEVE OPTIMISED SOLUTION 
  // NEED To learn matrix & DP for that
  // IMP Reference Article :  https://www.geeksforgeeks.org/sum-fibonacci-numbers/
  // Problem Link: https://www.geeksforgeeks.org/problems/fibonacci-sum1423/1
/*
Given a number positive number N, find the value of f0 + f1 + f2 +... + fN where fi indicates ith Fibonacci number.
Remember that f0 = 0, f1 = 1, f2 = 1, f3 = 2, f4 = 3, f5 = 5,
Since the answer can be very large, the answer takes modulo with 1000000007 and returned.  

F0 = 0; F1 =1 ; F2 = 1; F3 = 2;
for N =3 : F0+F1+F2+F3 = 0+1+1+2 = 4
 */

  // Time: O(n) and 
  // Space: O(1) 
  //Intiutive Approach to just sum all numbers till N
  public static long Fibosum(int N) {
   //In this problem
   //Fibo starts with n= 0
   //F0 = 0
   
    if(N==1)
    return 1;
    
    int f0 = 0;
    int f1 = 1;
    int fn = 0;
    long ans = 1;
    
    for(int i = 2;i <= N;i++) {
 
 //calculating the next term of 	 Fibonnaci Series
 
 fn = f0 + f1; 
 
 //storing the next fibonaci in answer 
  ans += fn;
  
  f0 = f1;
  f1 = fn;
 
    }
    return (ans % MOD);
  }


  // using the relation S(n0 = F(n+2) - 1
  //Find (n+2)th fibonnaci number and just subtract 1 from it to get the answer
  
  public static long Fibosum2(int N) {
  
  //This will be other way of calculating the sum of Fibonnaci Series till N
  // S(N) = F(N+2) - 1
  
 //First find (n+2)th Fibonnaci Number and then subtract 1 from it
 int MOD = 1000000007;
 long f0 = 0;
 long f1 = 1;
 long fn = 0;
 //to find nth fibonnaci number
 for(int i = 2;i<= N+2;i++) {
 fn = (f0 + f1)% MOD;
 f0 = f1;
 f1 = fn;
 }
//fn is the (N+2)th fibonnaci number
// Sum upto Nth Fibonnaci Number = (N+2)th fibonnaci number - 1;
 return(fn-1);
 
 
 }

  public static void main(String[] args) {
    int N = 12;
    System.out.println(Fibosum(N));
    System.out.println(Fibosum2(N));
  
}
}

//Also Fibonnaci Problems :
// https://www.geeksforgeeks.org/java-program-to-find-sum-of-fibonacci-series-numbers-of-first-n-even-indexes/
//https://www.geeksforgeeks.org/problems/number-of-digits2559/1
