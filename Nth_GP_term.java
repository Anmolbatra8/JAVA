// I am writing here wrong code
// Cause I want to solve this problem in future and update this file
// This is the Link: https://www.geeksforgeeks.org/problems/series-gp4646/1

//This is a naive approach to nth term of a Geometric progression 
// A nth term = a*r^(n-1)

//Problem statement: Given the A and R i,e first term and common ratio of a GP series. Find the Nth term of the series.
/*
Note: As the answer can be rather large print its modulo 1000000007 (109 + 7).

Example 1:

Input: A = 2, R = 2, N = 4
Output: 16
Explanation: The GP series is 
2, 4, 8, 16, 32,... in which 16 
is th 4th term. 
*/

public class Main {
 public static long Gpnterm(int a,int r ,int n) {
    int MOD = 1000000007;
  if(n==1)
  return a;
  
  if(n==2)
  return (long)a*r;
  
 // r has to be multiplied by itself (n-1) times
 long ans = r*r;
 
 if(n==3)
 return ((long) a * r % MOD);
  int i = 2;
 while(i < (n-1)) {
  i += 1;
 ans = ans * r;
  
 }
 return ((long) a * r % MOD);
 
 }
 
 public static void main(String[] args) {
 
 System.out.println(Gpnterm(4,3,3));
 
  }
}
