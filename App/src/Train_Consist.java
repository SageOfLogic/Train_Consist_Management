import java.util.Arrays;
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

        Arrays.sort(bogieIds);

        int low = 0;
        int high = n - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = bogieIds[mid].compareTo(searchKey);

            if (result == 0) {
                found = true;
                break;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found);

        sc.close();
    }
}