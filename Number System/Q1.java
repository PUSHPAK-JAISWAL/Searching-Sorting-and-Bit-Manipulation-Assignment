// Problem 1: given a number, print its binary representation. [easy]
// Input 1: number = 5
// Output 1: 101
// Input 2: number = 10
// Output 2: 1010

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        String binaryRepresentation = Integer.toBinaryString(number);
        System.out.println("The binary representation of " + number + " is " + binaryRepresentation);
    }
}
