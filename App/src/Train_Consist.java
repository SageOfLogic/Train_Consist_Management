import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Train_Consist {

    public static void main(String[] args) {

        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String bogie = sc.nextLine();
            int capacity = sc.nextInt();
            sc.nextLine();
            bogieCapacityMap.put(bogie, capacity);
        }

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }

        sc.close();
    }
}