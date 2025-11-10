import java.util.Scanner;

public class GuessingGame {

    public static void guessGame() {
        int randomNum = 3;
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        int x;

        do {
            System.out.println("What number am I thinking (0 to 9)? :");
            x = sc.nextInt();
            attempts++;

            if (x != randomNum) {
                System.out.println("No, try again");
            } else {
                System.out.println("Yes, it's " + randomNum);
                System.out.println("Number of attempts: " + attempts);
            }
        } while (x != randomNum);

        sc.close();
    }

    public static void main(String[] args) {
        guessGame();
    }
}
