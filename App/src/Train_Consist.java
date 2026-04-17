import java.util.*;

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

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : bogies) {
            System.out.println("Bogie: " + b.name + " | Capacity: " + b.capacity);
        }

        sc.close();
    }
}