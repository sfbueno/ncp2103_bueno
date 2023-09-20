import java.util.Random;
import javax.swing.JOptionPane;

public class inBetween {
    public static void main(String[] args) {
        Random random = new Random();
        double pocketMoney = 1000.00;

        while (pocketMoney > 0) {
            int firstCard = random.nextInt(13) + 1;
            int secondCard = random.nextInt(13) + 1;

            String[] options = {"DEAL", "NO DEAL"};
            int dealChoice = JOptionPane.showOptionDialog(
                    null,
                    "Pocket Money: \u20B1 " + pocketMoney + "\n" +
                            "First card: " + firstCard + "\n" +
                            "Second card: " + secondCard + "\n" +
                            "Choose 'DEAL' or 'NO DEAL'",
                    "In-Between Game",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            int thirdCard = random.nextInt(13) + 1;

            if (dealChoice == JOptionPane.YES_OPTION) {
                if ((thirdCard > Math.min(firstCard, secondCard) && thirdCard < Math.max(firstCard, secondCard))) {
                    double betAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter your bet amount:"));
                    if (betAmount <= pocketMoney) {
                        pocketMoney += betAmount;
                        JOptionPane.showMessageDialog(
                                null,
                                "The third card is: " + thirdCard + "\nCongratulations! You win!\nYour new pocket money: $" + pocketMoney,
                                "Result",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "Bet amount exceeds your pocket money. Please enter a valid bet amount.",
                                "Invalid Bet",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                } else {
                    double betAmount = Double.parseDouble(JOptionPane.showInputDialog("Enter your bet amount:"));
                    if (betAmount <= pocketMoney) {
                        pocketMoney -= betAmount;
                        JOptionPane.showMessageDialog(
                                null,
                                "Third card: " + thirdCard + "\nSorry, you lose.\nYour new pocket money: $" + pocketMoney,
                                "Result",
                                JOptionPane.ERROR_MESSAGE
                        );
                    } else {
                        JOptionPane.showMessageDialog(
                                null,
                                "Bet amount exceeds your pocket money. Please enter a valid bet amount.",
                                "Invalid Bet",
                                JOptionPane.ERROR_MESSAGE
                        );
                    }
                }
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Third card: " + thirdCard + "\nSorry, you lose.\nYour pocket money: $" + pocketMoney,
                        "Result",
                        JOptionPane.ERROR_MESSAGE
                );
            }
        }

        JOptionPane.showMessageDialog(
                null,
                "Game over! Your pocket money is zero. Thanks for playing!",
                "Game Over",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}
