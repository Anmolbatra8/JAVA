public class Main {
    public static void main(String[] args) {
    int[] my_array = {64, 34, 25, 5, 22, 11, 90, 12};
        int n = my_array.length;
        for (int i = 0; i < n-1; i++) {
  // assume first element of unsorted array as smallest
   int smallestIndex = i;
   			for (int j = i; j < (n-1); j++) {
            if(my_array[j+1] < my_array[smallestIndex])  
            {  
            smallestIndex = j+1;
            }
            }    
             //swap with initial element of unsorted array 
             if(smallestIndex != i) {
            my_array[i] = my_array[i] + my_array[smallestIndex]; 
            my_array[smallestIndex] = my_array[i] - my_array[smallestIndex];
            my_array[i] = my_array[i] - my_array[smallestIndex];
             }       
       }
// To Print:
        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(my_array[i] + " ");
        }
        System.out.println();
    }
}

//Java
