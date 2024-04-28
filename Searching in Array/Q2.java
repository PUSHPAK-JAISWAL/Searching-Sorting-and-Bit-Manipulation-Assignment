// Q2. Given an array and an integer “target”, return the last occurrence of “target” in the array. If the target is
// not present return -1.
// Input 1: arr = [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
// Output 1: 6
// Input 2: arr = [2 2 2 6 6 18 29 30 30 30] , target = 15
// Output 2: -1

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target:");
        int target = scanner.nextInt();

        int result = lastOccurrence(arr, target);
        System.out.print("The last occurrence of " + target + " is at index " + result);
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
