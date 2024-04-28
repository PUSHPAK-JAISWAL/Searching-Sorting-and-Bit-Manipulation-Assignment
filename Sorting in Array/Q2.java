// Q2. WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

// Q1. Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;

public class Q2 {

    public static void SelectionSort(int arr[]) {
        int n=arr.length;
        for (int index = 0; index < n-1; index++) {
            int max_index=index;
            for (int index1 = index+1; index1 < n; index1++) {
                if(arr[index1]>arr[max_index]) {
                    max_index=index1;
                }
            }
            int temp = arr[max_index];
            arr[max_index]=arr[index];
            arr[index]=temp;
        }
    }
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int elements;
        System.out.println("Enter the Number of Elements in Array. : ");
        elements = sc.nextInt();
        int arr[] = new int[elements];
        System.out.println("Enter the Elements in Array. : ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}