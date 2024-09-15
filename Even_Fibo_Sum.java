/*
Link: https://www.geeksforgeeks.org/problems/even-fibonacci-numbers-sum1455/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card

Given a number N find the sum of all the even valued terms in the Fibonacci sequence less than or equal to N.
The first few terms of Fibonacci Numbers are, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ,… (Even numbers are highlighted).
 

Sample test Case:
Input:
N = 8
Output:
10

Explanation:
There are two even 
fibonacci numbers less
than equal to 8, 8 and 2 
and 8 + 2 = 10
*/

/*
Approach 1: Intiuitive to calculate whole fibo series and keep adding the even numbers only till N
Time: O(n)
Space: O(1)
*/

 static long evenFiboSum(long N){
   

       
        int a = 1;
        int b = 1;
        long ans = 0;
        
        int next = a+b;
        
        while(next <= N) {
            if(next % 2 == 0)
            ans = ans + next;
            
            a =b;
            b = next;
            next = a+b;
            
        }
        return ans;
    } 





/*
Approach 2:
Time Complexity: O(log N)
Space Complexity: O(1)
Termination condition (ef3 > N) ensures that no even Fibonacci number greater than N is included in the sum.
*/

 public static long Evenfibosum(int N) {
 /*
 1,1,2,3,5,8,13,21
 Every third element is even
 and third element is :
 let first even no : f1 (0)
 let 2nd even no : f2 (2)
 next even number is:
 f3 = 4f2+ f1
 
 */
 int ef1 = 0;
 int ef2 = 2;
 int ef3 = 0;
 
 //to calculate sum of Even fibonnaci nubers
 long sum = ef1+ef2;
 while(ef2 <= N) {
 
 //next even fibonnaci number formula
 //Fact: every 3rd element is even in fibo series (given that starts with : 1,1,..)
 
 
 ef3 = 4*ef2 + ef1;
 
 if(ef3 > N)
 break;
 sum += ef3;
 ef1 = ef2;
 ef2 = ef3;

 
 }
 return sum;
 
 }

 public static void main(String[] args) {

    long result = evenFiboSum(400);
   System.out.println("Approach 1 : " + result);

   
   long answer = Evenfibosum(400);
   System.out.println("Approach 2 using next Even formula: " + answer);
    }  
  }


 
