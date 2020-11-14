package exercise7;

import java.util.Scanner;

public class RecursivePrimePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = input.nextInt();

        printPrimes(n);
    }

    public static void printPrimes(int n) {
        for (int i = n; i > 0; i--) {
          if (isPrime(i) == true) {
            System.out.println(i);
          }
        }
    }

    public static boolean isPrime(int n) {
      int count = 0;
      int d = 1;
      boolean prime = false;

      while (d <= n) {
        if (n%d == 0) {
          count++;
        }
        d++;
        if (count <= 2) {
          prime = true;
          }
        else {
          prime = false;
        } 
      }  
      return prime;
    }
}
