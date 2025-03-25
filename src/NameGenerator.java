import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        String[] firstNames = {"John", "Emma", "Liam", "Olivia", "Noah"};
        String[] lastNames = {"Smith", "Johnson", "Brown", "Taylor", "Anderson"};

        System.out.print("How many random names to generate? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String firstName = firstNames[rand.nextInt(firstNames.length)];
            String lastName = lastNames[rand.nextInt(lastNames.length)];
            System.out.println(firstName + " " + lastName);
        }
    }
}
