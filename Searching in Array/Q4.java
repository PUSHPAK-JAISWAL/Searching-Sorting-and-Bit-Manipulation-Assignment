// Q4. Given a sorted integer array containing duplicates, count occurrences of a given number. If the element
// is not found in the array, report that as well.
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 5
// Output: Target 5 occurs 3 times
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 6
// Output: Target 6 occurs 2 times

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = scanner.nextInt();

        int first = firstOccurrence(arr, target);
        int last = lastOccurrence(arr, target);

        if (first != -1 && last != -1) {
            System.out.println("Target " + target + " occurs " + (last - first + 1) + " times");
        } else {
            System.out.println("Target " + target + " is not found in the array");
        }
    }

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
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
