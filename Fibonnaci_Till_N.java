public class Main {
// Gfg ref article : https://www.geeksforgeeks.org/program-to-print-first-n-fibonacci-numbers/
//this can be solved : https://www.geeksforgeeks.org/problems/print-first-n-fibonacci-numbers1002/1

//Next problems building upon this : N th Fibonnaci Number (imp) : https://www.geeksforgeeks.org/problems/nth-fibonacci-number1335/1
  
/*
n input
array of length n
0th and  1th element fix: 0,1
2-(n-1) index loop -> store fibo digits


i/p = 4
o/p = 0,1,1,2

*/
  
//Basic intiutive Fibonnaci function 
//T:  O(n)
// S : O(n)
public long[] fibonnaci_one(int n) {

long[] ans = new long[n];
ans[0] = 0; //can also be 1 (if stated in problem)
if(n == 1)
 return ans;
 
ans[1] = 1;

for(int i = 2;i < n;i++) {
ans[i] = ans[i-1] + ans[i-2];
}
return ans;
}

//Fibonnaci function recursion
public static int fibonnaci_rec(int n) {

if(n == 0) 
  return 0;
  
 if(n ==1)
  return 1;
  return(fibonnaci_rec(n-1) +fibonnaci_rec(n-2));
  
}
public void fibonnaci_iter(int n) {

int f1 = 0;
int f2 = 1;

System.out.print(f1 + " ");
if(n < 1)
 return;
 
for(int i = 1;i < n;i++) {
System.out.print(f2+" ");
int next = f1+ f2;
f1 = f2;
f2 = next;

}

}


  public static void main(String[] args) {
   Main m1 = new Main();    
   //Driver code for 1st function (array)
  System.out.println("Simple array approach:");

System.out.println("Time: O(n) and Space: O(n)");
  
   int n1 = 5;
   long[] res = m1.fibonnaci_one(n1);
   for(int i =0;i< n1;i++) {
  System.out.print(res[i] + " ");
   }
    System.out.println("\n--------------------- \n");
    
    //Driver code for 1st recursive function :
    System.out.println("\n Recursion Function 1: ");
    System.out.println("Time Complexity: O(n*2^n)" + 
    "Auxiliary Space: O(n) \n");
    
    //Printing for fibonnaci_rec:
    int n = 5;
    for(int i = 0;i < n;i++) {
    System.out.print(fibonnaci_rec(i) + " ");
    }
    System.out.println("\n--------------------- \n");
   
   //Iterative : fibonnaci_iter(n)
   System.out.println("Iterative Appraoch : \n");
    System.out.println("Time Complexity: O(n)");
System.out.println("Auxilary Space: O(1)"); 
    m1.fibonnaci_iter(5);
     
  }
}
