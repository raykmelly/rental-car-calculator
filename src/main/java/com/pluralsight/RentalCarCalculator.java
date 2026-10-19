package com.pluralsight;
import java.util.Scanner;
public class RentalCarCalculator {
    public static void main(String[] args) {
        // Create new scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt for rental pickup information
        System.out.println("Enter a pickup date (MM-DD-YYYY): ");
        String pickupDate = scanner.nextLine();
        System.out.println("Enter number of days for the rental: ");
        int rentalDays = scanner.nextInt();

        // Fix scanner
        scanner.nextLine();

        // Prompt for more information
        System.out.println("Do you want an electronic toll tag? + $3.95/day. (Y/N): ");
        String hasTag = scanner.nextLine();
        System.out.println("Do you want a GPS? + $2.95/day. (Y/N): ");
        String hasGPS = scanner.nextLine();
        System.out.println("Do you want roadside assistance? + $3.95/day. (Y/N): ");
        String hasRoadAssistance = scanner.nextLine();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Display basic car rental cost
        double basicDailyFee = CalculateDailyFee(age);
        System.out.printf("%n[Basic daily fee]: %.2f%n",basicDailyFee);

        // Close the scanner
        scanner.close();
    }

    public static double CalculateDailyFee(int age){
        // Default daily rental fee
        double dailyFee = 29.99;
        if (age < 25) {
            // If under 25, add a 30% additional charge to the daily rental fee
            dailyFee += dailyFee * (30.0/100.0);
        }
        // Return the daily rental fee
        return dailyFee;
    }

    public static double CalculateOptionsCost(String hasTag, String hasGPS, String hasRoadAssistance) {
        double totalOptionsCost = 0;

        return totalOptionsCost;
    }
}