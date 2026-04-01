import java.util.ArrayList;

public class Train_Consist_Management {
    public static void main(String[] args) {
        ArrayList<String> bogies = new ArrayList<>();

        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        System.out.println("After Adding Bogies: " + bogies);

        bogies.remove("AC Chair");

        System.out.println("Contains Sleeper: " + bogies.contains("Sleeper"));

        System.out.println("Final Bogie List: " + bogies);
    }
}