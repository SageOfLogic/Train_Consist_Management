import java.util.HashSet;
import java.util.Set;

public class Train_Consist_Management {
    public static void main(String[] args) {
        Set<String> bogieIds = new HashSet<>();

        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Adding duplicate ID: BG101...");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Warning: Duplicate Bogie ID detected. BG101 was not added again.");
        }

        System.out.println("\nFinal Train Consist (Unique IDs):");
        System.out.println(bogieIds);

        System.out.println("\nTotal Unique Bogies: " + bogieIds.size());
    }
}