// Problem 2: given a number ‘n’, predict whether it is a power of two or not. [medium]
// Input 1: n = 15
// Output 1: False
// Input 2: n = 32
// Output 2: True

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("False");
        } else {
            while (number % 2 == 0) {
                number = number / 2;
            }
            if (number == 1) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }
    }
}
