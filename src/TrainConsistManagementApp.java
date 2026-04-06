// Train Consist Management App
// UC20 - Exception Handling During Search Operations
// @author - Bhavy Manchanda

import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC20 - Exception Handling During Search");
        System.out.println("=====================================\n");

        String[] bogieIDs = {}; // Empty bogie collection

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        if (bogieIDs.length == 0) {
            throw new IllegalStateException("Search operation cannot be performed: No bogies available in the train.");
        }

        boolean found = false;
        for (String id : bogieIDs) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found in the consist.");
        }

        System.out.println("\nUC20 completed...");
        sc.close();
    }
}