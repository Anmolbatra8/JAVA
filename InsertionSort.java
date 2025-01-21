//INSERTION SORT IMPLEMENTATION
public class Main {
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90, 5};
        int n = arr.length;
       int temp,j;
       
       for(int i = 1; i <=(n-1);i++) {
       temp = arr[i];
       j = i-1;
       while(j >= 0 && arr[j] > temp) {
       arr[j+1] = arr[j];
       j--;       
       }
       arr[j+1] = temp;
       }
        System.out.print("Sorted array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}

