import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

public class Train_Consist {

    static class PassengerBogie {
        String name;
        int capacity;

        PassengerBogie(String name, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            int n = sc.nextInt();
            sc.nextLine();

            List<PassengerBogie> bogies = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String name = sc.nextLine();
                int capacity = sc.nextInt();
                sc.nextLine();

                bogies.add(new PassengerBogie(name, capacity));
            }

            System.out.println("Bogie creation successful");
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}