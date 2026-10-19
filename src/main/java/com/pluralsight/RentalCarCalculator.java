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
        double dailyFee = 29.99;
        System.out.printf("%n[Basic rental cost]: %.2f",dailyFee);
        double finalDailyFee = CalculateDailyFee(dailyFee,age);
        System.out.printf("%n[Daily fee]: %.2f",finalDailyFee);
        // Display the daily options cost
        double optionsCost = CalculateOptionsCost(hasTag,hasGPS,hasRoadAssistance);
        System.out.printf("%n[Daily options add-ons]: %.2f",optionsCost);

        // Close the scanner
        scanner.close();
    }

    public static double CalculateDailyFee(double dailyFee, int age){
        // Default daily rental fee
        double finalDailyFee = dailyFee;
        if (age < 25) {
            // If under 25, add a 30% additional charge to the daily rental fee
            System.out.println("->You're under 25, adding a 30% surcharge to daily rental fee...");
            finalDailyFee += finalDailyFee * (30.0/100.0);
        }
        // Return the daily rental fee
        return finalDailyFee;
    }

    public static double CalculateOptionsCost(String hasTag, String hasGPS, String hasRoadAssistance) {
        // Calculate the total of all the options you selected
        double totalOptionsCost = 0;
        if (hasTag.equalsIgnoreCase("Y")) {
            totalOptionsCost += 3.95;
        }
        if (hasGPS.equalsIgnoreCase("Y")) {
            totalOptionsCost += 2.95;
        }
        if (hasRoadAssistance.equalsIgnoreCase("Y")) {
            totalOptionsCost += 3.95;
        }
        return totalOptionsCost;
    }
}