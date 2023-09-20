import javax.swing.JOptionPane;

public class loopeng {
    public static void main(String[] args) {

        int userInput;
        int sumGreater = 0;
        int productLess = 1; // Initialize to 1 for multiplication
        int numDiv3 = 0;
        int numDiv5 = 0;
        int thriceEven = 1; // Initialize to 1 for multiplication

        while (true) {
            userInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a number:"));
            if (userInput == 0) {
                break;
            }
            if (userInput >= 10) {
                sumGreater += userInput;
            }
            if (userInput < 5) {
                productLess *= userInput;
            }
            if (userInput % 3 == 0) {
                numDiv3++;
            }
            if (userInput % 5 == 0) {
                numDiv5++;
            }
            if (userInput % 2 == 0) {
                thriceEven *= userInput;
            }
        }

        // Display the statistics
        JOptionPane.showMessageDialog(null, "Sum of numbers greater than or equal to 10: " + sumGreater +
                "\nProduct of numbers less than 5: " + productLess + "\nCount of numbers divisible by 3: " + numDiv3 +
                "\nCount of numbers divisible by 5: " + numDiv5 + "\nProduct of even numbers: " + thriceEven * 3);
    }
}
