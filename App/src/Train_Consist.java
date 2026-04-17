import java.util.*;

public class Train_Consist {

    static class Bogie {
        String type;
        String cargo;

        Bogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Bogie> bogies = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String type = sc.nextLine();
            String cargo = sc.nextLine();
            bogies.add(new Bogie(type, cargo));
        }

        boolean isSafe = bogies.stream()
                .allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical")
                        || b.cargo.equalsIgnoreCase("Petroleum"));

        System.out.println(isSafe);

        sc.close();
    }
}