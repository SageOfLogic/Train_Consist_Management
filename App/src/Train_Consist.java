import java.util.Scanner;

public class Train_Consist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] capacities = new int[n];

        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(capacities[i]);
        }

        sc.close();
    }
}