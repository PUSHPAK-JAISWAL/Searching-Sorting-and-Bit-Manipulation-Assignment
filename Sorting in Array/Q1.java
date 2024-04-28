// Q1. Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;

public class Q1 {

    public static void BubbleSort(int arr[]) {
        int n=arr.length;
        for (int index = 0; index < n-1; index++) {
            for (int index1 = 0; index1 < n-index-1; index1++) {
                if(arr[index1]<arr[index1+1]) {
                    int temp = arr[index1];
                    arr[index1] = arr[index1+1];
                    arr[index1+1] = temp;
                }
            }
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
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}