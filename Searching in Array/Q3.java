// Q3. Given a sorted binary array, efficiently count the total number of 1’s in it.
// Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
// Output 1: 6
// Input 2: arr = [ 0 0 0 0 0 1 1]
// Output 2: 2

import java.util.*;
import java.io.*;

public class Q3 {

    public static int TotalOnes(int arr[]) {
        int first =0;
        int last =arr.length-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) {
                first =i-1;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]==1) {
                last=i;
                break;
            }
        }
        return last-first;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int elements;
        System.out.print("Enter the Number of Elements in the Array : ");
        elements = sc.nextInt();
        int arr[]=new int[elements];
        System.out.print("Enter the Elements of the Array. : ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print(TotalOnes(arr));
    }
}