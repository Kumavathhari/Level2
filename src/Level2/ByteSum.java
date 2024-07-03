package Level2;

import java.util.Scanner;

public class ByteSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first byte value: ");
        byte byte1 = scanner.nextByte();
        System.out.print("Enter second byte value: ");
        byte byte2 = scanner.nextByte();

        int sum = (int) byte1 + (int) byte2;

        System.out.println("Sum of " + byte1 + " and " + byte2 + " is: " + sum);

        scanner.close();
    }
}
