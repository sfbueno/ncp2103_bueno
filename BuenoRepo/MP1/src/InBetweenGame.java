import javax.swing.JOptionPane;
import java.util.Random;

public class InBetweenGame {
    public static void main(String[] args) {
        int firstCard = generateRandomCard();
        int secondCard = generateRandomCard();


        String message = "First card: " + firstCard + "\nSecond card: " + secondCard;

        if (firstCard == secondCard) {
            String higherOrLower = JOptionPane.showInputDialog(
                    message + "\n\nThe two cards are the same.\nWill the next card be 'HIGHER' or 'LOWER'?"
            );

            int thirdCard = generateRandomCard();
            message += "\nThird card: " + thirdCard;

            if ((higherOrLower.equalsIgnoreCase("HIGHER") && thirdCard > secondCard)
                    || (higherOrLower.equalsIgnoreCase("LOWER") && thirdCard < secondCard)) {
                message += "\nCongratulations! You win!";
            } else {
                message += "\nSorry, you lost.";
            }
        } else {
            String dealOrNoDeal = JOptionPane.showInputDialog(
                    message + "\n\nDo you want to 'DEAL' or 'NO DEAL'?"
            );

            if (dealOrNoDeal.equalsIgnoreCase("DEAL")) {
                int thirdCard = generateRandomCard();
                message += "\nThird card: " + thirdCard;

                if ((thirdCard > Math.min(firstCard, secondCard)) && (thirdCard < Math.max(firstCard, secondCard))) {
                    message += "\nCongratulations! You win!";
                } else {
                    message += "\nSorry, you lost.";
                }
            } else {
                message += "\nSorry, you lost.";
            }
        }

        JOptionPane.showMessageDialog(
                null,
                message,
                "In-Between Game",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static int generateRandomCard() {
        Random rand = new Random();
        return rand.nextInt(13) + 1;
    }
}
