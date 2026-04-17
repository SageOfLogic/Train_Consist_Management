import java.util.Scanner;

public class Train_Consist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieIds = new String[n];

        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        String searchKey = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (bogieIds[i].equals(searchKey)) {
                found = true;
                break;
            }
        }

        System.out.println(found);

        sc.close();
    }
}