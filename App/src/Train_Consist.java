import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Train_Consist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String trainId = sc.nextLine();
        String cargoCode = sc.nextLine();

        String trainPattern = "TRN-\\d{4}";
        String cargoPattern = "PET-[A-Z]{2}";

        Pattern p1 = Pattern.compile(trainPattern);
        Pattern p2 = Pattern.compile(cargoPattern);

        Matcher m1 = p1.matcher(trainId);
        Matcher m2 = p2.matcher(cargoCode);

        if (m1.matches()) {
            System.out.println("Valid Train ID");
        } else {
            System.out.println("Invalid Train ID");
        }

        if (m2.matches()) {
            System.out.println("Valid Cargo Code");
        } else {
            System.out.println("Invalid Cargo Code");
        }

        sc.close();
    }
}