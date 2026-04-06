import java.util.*;

public class TrainConsistManagementApp {

    static class PassengerBogie {
        String type;
        int capacity;

        PassengerBogie(String type, int capacity) {
            this.type = type;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC16 - Sort Passenger Bogies by Capacity");
        System.out.println("=====================================\n");

        PassengerBogie[] bogies = {
                new PassengerBogie("Sleeper", 72),
                new PassengerBogie("AC Chair", 56),
                new PassengerBogie("First Class", 24),
                new PassengerBogie("Sleeper", 70),
                new PassengerBogie("AC Chair", 60)
        };

        int n = bogies.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (bogies[j].capacity > bogies[j + 1].capacity) {
                    PassengerBogie temp = bogies[j];
                    bogies[j] = bogies[j + 1];
                    bogies[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Passenger Bogies by Capacity:");
        for (PassengerBogie b : bogies) {
            System.out.println(b.type + " -> " + b.capacity);
        }

        System.out.println("\nUC16 completed...");
    }
}