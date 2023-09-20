import javax.swing.JOptionPane;

public class changeCounter {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter the amount of change:");
        double customerAmount = Double.parseDouble(input);

        String result = computeChange(customerAmount);

        JOptionPane.showMessageDialog(null, "Change breakdown:\n" + result);
    }

    public static String computeChange(double amount) {
        double[] currencies = { 500, 200, 100, 50, 20, 10, 5, 1, 0.1, 0.05, 0.01 };
        String[] currencyNames = { "500s", "200s", "100s", "50s", "20s", "10s", "5s", "1s", "10cs", "5cs", "1cs" };
        StringBuilder changeBreakdown = new StringBuilder();

        for (int i = 0; i < currencies.length; i++) {
            if (currencies[i] >= 1) {
                int count = (int) (amount / currencies[i]);
                if (count > 0) {
                    changeBreakdown.append(currencyNames[i]).append(": ").append(count).append("\n");
                    amount -= count * currencies[i];
                }
            } else {
                int count = (int) (amount / currencies[i]);
                if (count > 0) {
                    changeBreakdown.append(currencyNames[i]).append(": ").append(count).append("\n");
                    amount -= count * currencies[i];
                }
            }
        }

        return changeBreakdown.toString();
    }
}
