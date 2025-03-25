import java.util.Random;
import java.util.Scanner;

public class MultiplicationExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean mastered = false;

        while (!mastered) {
            int score = 0;
            for (int i = 1; i <= 10; i++) {
                int num1 = random.nextInt(10) + 1; // 1-10
                int num2 = random.nextInt(10) + 1; // 1-10
                System.out.print("Question " + i + ": What is " + num1 + " * " + num2 + "? ");
                int answer = scanner.nextInt();
                if (answer == num1 * num2) {
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Wrong! The correct answer was " + (num1 * num2));
                }
            }

            System.out.println("Your score: " + score + "/10");
            if (score == 10) {
                System.out.println("🎉 Congratulations! You mastered the multiplication table!");
                mastered = true;
            } else {
                System.out.println("Let's try again!");
            }
        }
    }
}
