import java.util.*;

public class TrainConsistManagementApp {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Petroleum cannot be loaded in Rectangular bogie");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo + " -> " + shape + " bogie");
            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Cargo assignment attempt completed for " + shape + " bogie\n");
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC15 - Safe Cargo Assignment");
        System.out.println("=====================================\n");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical"));
        bogies.add(new GoodsBogie("Rectangular"));

        bogies.get(0).assignCargo("Petroleum");
        bogies.get(1).assignCargo("Petroleum");
        bogies.get(1).assignCargo("Coal");

        System.out.println("UC15 completed...");
    }
}