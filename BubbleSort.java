//Implementation Of Bubble Sort
// Best Case: O(n) {due to flag 'swapped'}
// Worst Case: O(n^2) 




public class Main {
    public static void main(String[] args) {
    int[] arr = {12,3,8,1,19};
    int n = arr.length;
 
   for(int pass = 0;pass < (n-1);pass++) {
   boolean swapped = false;
   for(int i = 0;i <(n-1-pass) ;i++) {
   if(arr[i+1] > arr[i]) {
   arr[i] = arr[i]+ arr[i+1];
   arr[i+1] = arr[i] - arr[i+1];
   arr[i] = arr[i] - arr[i+1];
   swapped = true;
   }
   // Flag
    }
   if(swapped == false) 
   break;
		}
//  To Print the Array
 for(int k = 0;k < n;k++) {
 System.out.println(arr[k]);
 }
           }
           }
