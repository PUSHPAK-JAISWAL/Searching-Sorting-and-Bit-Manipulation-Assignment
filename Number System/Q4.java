// Q4. Given a number, count the number of set bits in that number without using an extra space.
// Note : bit ‘1’ is also known as set bit.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }

        System.out.println("The number of set bits is " + count);
    }
}
