public class Main {

//Link: https://www.geeksforgeeks.org/sum-array-elements-using-recursion/

  // Recrusive function to get sum of array
public static float Sumarray_rec(float[] arr,int N) {
//Base case when N = 0
if(N == 0)
return arr[N];

return(arr[N] + Sumarray_rec(arr,N-1));
}
//Simple function to calculate Sum of Array iteratively:
  
public static float sumofarray(float[] arr)
{
int n = arr.length;
float result = 0.00f;
if(n == 0)
return result;

if(n==1)
return arr[0];

for(float num:arr)
{
result += num;
}
return result;
}

public static void main(String[] args) {
float[] arr = {4,7,8,9};
//Driver for Simple approach:
float result = sumofarray(arr);
System.out.println("Simple intiutive approach: \nTime-> O(n) \nSpace->O(1)");
System.out.println("The Sum of given array is : " + result);

//Driver for recrusive function:
int size = arr.length;
float summ = Sumarray_rec(arr,size-1);
System.out.println("\n \n Using Recrusive approach: \n T: O(N) and Space: O(n)\n"+summ);

}
}
