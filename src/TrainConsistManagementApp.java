import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // UC2 Passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition:");
        System.out.println(passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After removing AC Chair:");
        System.out.println(passengerBogies);

        if(passengerBogies.contains("Sleeper")){
            System.out.println("Sleeper bogie exists.");
        }

        // UC3 Unique bogie IDs
        Set<String> bogieIDs = new HashSet<>();

        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG101");
        bogieIDs.add("BG103");

        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);

        // UC4 Ordered Train Consist
        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        trainConsist.add(2,"Pantry Car");

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("Final ordered train consist:");
        System.out.println(trainConsist);

    }
}