import java.util.*;

public class LuckyNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int score = 0;
        String choice = "y";

        System.out.println("🎮 Lucky Number Game");

        while (choice.equalsIgnoreCase("y")) {

            System.out.print("Pick a number (1-10): ");
            int user = sc.nextInt();

            int computer = rand.nextInt(10) + 1;

            System.out.println("Computer picked: " + computer);

            if (user == computer) {
                System.out.println("🎉 You guessed correctly!");
                score++;
            } else {
                System.out.println("❌ Not matched!");
            }

            System.out.println("Score: " + score);

            System.out.print("Play again? (y/n): ");
            choice = sc.next();
        }

        System.out.println("Final Score: " + score);
    }
}