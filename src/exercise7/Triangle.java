package exercise7;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = input.nextInt();

        for (int line = 1; line <= n; line++) {
            printLine(1, line);
        }

        for (int line = n - 1; line >= 1; line--) {
          printLine(1, line);
        }

        // Print the bottom part of the triangle that is under the longest line
    }

    public static void printLine(int start, int end) {
      for (int i = start; i <= end; i++) {
            if (i > 1) {
              System.out.print(" " + i);
            }
            else
            System.out.print(i);
          }
          System.out.println();
    }
}
