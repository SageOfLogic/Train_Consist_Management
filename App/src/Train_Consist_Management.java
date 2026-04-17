import java.util.LinkedHashSet;
import java.util.Set;

public class Train_Consist_Management {
    public static void main(String[] args) {
        Set<String> trainFormation = new LinkedHashSet<>();

        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        System.out.println("Current Train Formation (Order Maintained):");
        System.out.println(trainFormation);

        System.out.println("\nAttempting to attach duplicate bogie: Sleeper...");
        boolean isAdded = trainFormation.add("Sleeper");

        if (!isAdded) {
            System.out.println("System Alert: Duplicate Bogie 'Sleeper' rejected. Uniqueness enforced.");
        }

        System.out.println("\nFinal Verified Train Formation:");
        System.out.println(trainFormation);
    }
}