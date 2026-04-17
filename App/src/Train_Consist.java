import java.util.*;
import java.util.stream.Collectors;

public class Train_Consist {

    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Bogie> bogies = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            int capacity = sc.nextInt();
            sc.nextLine();
            bogies.add(new Bogie(name, capacity));
        }

        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        for (Bogie b : filteredBogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }

        sc.close();
    }
}