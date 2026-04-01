import java.util.LinkedList;

public class Train_Consist_Management {
    public static void main(String[] args) {
        LinkedList<String> trainConsist = new LinkedList<>();

        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");
        trainConsist.addLast("Guard Coach");

        System.out.println("Initial Train Formation:");
        System.out.println(trainConsist);

        trainConsist.add(2, "Pantry Car");
        System.out.println("\nAfter adding Pantry Car at index 2:");
        System.out.println(trainConsist);

        trainConsist.removeFirst();
        trainConsist.removeLast();

        System.out.println("\nFinal Train Consist (After removing Engine and Guard):");
        System.out.println(trainConsist);
    }
}