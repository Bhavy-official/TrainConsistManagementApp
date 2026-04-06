// Train Consist Management App
// UC17 - Sort Bogie Names Using Arrays.sort()
// @author - Bhavy Manchanda

import java.util.Arrays;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC17 - Sort Bogie Names Alphabetically");
        System.out.println("=====================================\n");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        Arrays.sort(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));

        System.out.println("\nUC17 completed...");
    }
}