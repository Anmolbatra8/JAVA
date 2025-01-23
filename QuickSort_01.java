// Referrence : Jenny Lecture
public class Main {
   
 public static void main(String[] args) {
  int[] arr = {50,25,92,16,76,30,43,54,19};
  Quicksort(arr,0,arr.length-1);
  
  for (int num : arr) {
            System.out.print(num + " ");
        }
   }
   
   public static void Quicksort(int[] arr,int low,int high) {
   if(low < high) {
 int loc = partition(arr,low,high); 
 Quicksort(arr,low,loc-1);
 Quicksort(arr,loc+1,high);  
 }
 }
 
 public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
   //Partition Function 
 public static int partition(int[] arr,int low,int high) {
 int pivot = arr[low];
 int start = low+1;
 int end = high;
 

while(start <= end) {


while (start <= end && arr[start] <= pivot) {
    start++;
}
while (start <= end && arr[end] > pivot) {
    end--;
}
if(start < end) {
// Then swap start and end position element
swap(arr,start,end);
}
 }
   
 //swap end element with pivot
swap(arr,end,low);
return end;
}
   
}


