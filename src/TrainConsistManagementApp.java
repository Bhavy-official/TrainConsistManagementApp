// Train Consist Management App
// UC18 - Linear Search for Bogie ID
// @author - Bhavy Manchanda

import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC18 - Linear Search for Bogie ID");
        System.out.println("=====================================\n");

        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

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

        System.out.println("\nUC18 completed...");
        sc.close();
    }
}