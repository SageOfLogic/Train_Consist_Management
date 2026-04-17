import java.util.Arrays;
import java.util.Scanner;

public class Train_Consist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] bogieNames = new String[n];

        for (int i = 0; i < n; i++) {
            bogieNames[i] = sc.nextLine();
        }

        Arrays.sort(bogieNames);

        System.out.println(Arrays.toString(bogieNames));

        sc.close();
    }
}