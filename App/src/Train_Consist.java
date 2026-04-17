import java.util.*;

class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

public class Train_Consist {

    static class GoodsBogie {
        String shape;
        String cargo;

        GoodsBogie(String shape) {
            this.shape = shape;
        }

        void assignCargo(String cargo) {
            try {
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException("Unsafe cargo assignment: Petroleum not allowed in Rectangular bogie");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully");
            } catch (CargoSafetyException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Cargo assignment process completed");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        List<GoodsBogie> bogies = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String shape = sc.nextLine();
            String cargo = sc.nextLine();

            GoodsBogie b = new GoodsBogie(shape);
            b.assignCargo(cargo);

            bogies.add(b);
        }

        sc.close();
    }
}