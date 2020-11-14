package exercise7;

import java.util.Scanner;

public class TimeValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = input.nextInt();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();

        boolean timeValid = false;
        
        if ( areHoursValid(hours) == true && areMinutesValid(minutes) == true) {
          timeValid = true;
          }
        System.out.println(areHoursValid(hours));
        System.out.println(areMinutesValid(minutes)); 
        System.out.println("Time valid: " + timeValid);
    }


    public static boolean areHoursValid(int hours) {
        if (hours < 0 || hours > 23) {
          return false;
        }
        else {
          return true;
        }
        
    }


    public static boolean areMinutesValid(int minutes) {
        if (minutes < 0 || minutes > 59) {
          return false;
        }
        else {
          return true;
        }
    }
}
