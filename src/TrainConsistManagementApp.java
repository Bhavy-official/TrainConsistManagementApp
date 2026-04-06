// Train Consist Management App
// UC19 - Binary Search for Bogie ID (Optimized Searching)
// @author - Bhavy Manchanda

import java.util.Arrays;
import java.util.Scanner;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC19 - Binary Search for Bogie ID");
        System.out.println("=====================================\n");

        String[] bogieIDs = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        Arrays.sort(bogieIDs);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Bogie ID to search: ");
        String searchKey = sc.nextLine();

        int low = 0;
        int high = bogieIDs.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = bogieIDs[mid].compareTo(searchKey);

            if (cmp == 0) {
                found = true;
                break;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in the consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " NOT found in the consist.");
        }

        System.out.println("\nUC19 completed...");
        sc.close();
    }
}