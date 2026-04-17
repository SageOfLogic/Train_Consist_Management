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

        long startLoop = System.nanoTime();

        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.capacity > 60) {
                loopResult.add(b);
            }
        }

        long endLoop = System.nanoTime();
        long loopTime = endLoop - startLoop;

        long startStream = System.nanoTime();

        List<Bogie> streamResult = bogies.stream()
                .filter(b -> b.capacity > 60)
                .toList();

        long endStream = System.nanoTime();
        long streamTime = endStream - startStream;

        System.out.println("Loop Time: " + loopTime);
        System.out.println("Stream Time: " + streamTime);

        sc.close();
    }
}