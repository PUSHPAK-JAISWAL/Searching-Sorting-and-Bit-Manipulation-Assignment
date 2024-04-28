// Q5. Given an integer array, duplicates are present in it in a way that all duplicates appear an even
// number of times except one which appears an odd number of times. Find that odd appearing
// element in linear time and without using any extra memory.
// For example,
// Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
// Output : The odd occurring element is 4.

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The odd occurring element is " + getOddOccurrence(arr));
    }

    static int getOddOccurrence(int arr[]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            // XOR operation
            res = res ^ arr[i];
        }
        return res;
    }
}
