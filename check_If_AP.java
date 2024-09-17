/*
Link to the article : https://www.geeksforgeeks.org/check-whether-arithmetic-progression-can-formed-given-array/

To problem: https://www.geeksforgeeks.org/problems/check-arithmetic-progression1842/0
Important approach using Hashing are discussed in the article which are more efficient
*/

//This approach takes O(n log n) time 
//Better optimization can be achieved using hashing

import java.util.Arrays;
public class Main {

//Program to check whether an Arithmetic Progression can be formed in the array or not 

// I/p: 0,4,6,2
// O/p: yes
// first we will sort the array recieved
// then if the common difference is consistent across the sorted array we will return true else false 

public static boolean isAP(int[] arr) {
int size = arr.length;
if(size==1)
return true;
Arrays.sort(arr);
int d = arr[1]-arr[0];

for(int j = 1;j< (size-1);j++) {
if(arr[j+1]-arr[j] != d)
return false;
}
return true;
}
public static void main(String[] args) {
  int[] arr = {6,2,9,4};
  System.out.println("Is this AP:"+ isAP(arr));
  }
}


