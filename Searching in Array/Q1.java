// Q1. Given an array. FInd the number X in the array. If the element is present, return the index of the element,
// else print “Element not found in array”. Input the size of array, array from user and the element X from user.
// Use Linear Search to find the element.

import java.util.*;
import java.io.*;

public class Q1 {
    
    public static void LinearSearch(int arr[],int target) {
        int index=-1;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                index = i;
            }
        }
        if(index==-1) {
            System.out.println("Element is Not Found.  ");
        }
        else {
            System.out.println("Element is Found an Index : "+index);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of Elements in Array. : ");
        int elements;
        int target;
        elements = sc.nextInt();
        int arr[]=new int[elements];
        System.out.print("Enter the Elements of Array. : ");
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the Target Element : ");
        target=sc.nextInt();
        LinearSearch(arr,target);
    }
}