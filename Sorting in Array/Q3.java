// Q3. WAP to sort an array in decreasing order using insertion sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;

public class Q3 {

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               less than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int elements;
        System.out.println("Enter the Number of Elements in Array. : ");
        elements = sc.nextInt();
        int arr[] = new int[elements];
        System.out.println("Enter the Elements in Array. : ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
