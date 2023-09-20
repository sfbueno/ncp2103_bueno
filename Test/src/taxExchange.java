import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class taxExchange {
    public static void main(String[] args) {

        double income, estimatedTax, annualSalary, monthlyIncomeTax;

        income = Double.parseDouble(JOptionPane.showInputDialog(null, "Input your Income per month: "));

        annualSalary = income * 12;

        if (annualSalary <= 250000) {
            estimatedTax = 0;
        } else if (annualSalary <= 400000) {
            estimatedTax = (annualSalary - 250000) * 0.20;
        } else if (annualSalary <= 800000) {
            estimatedTax = 30000 + (annualSalary - 400000) * 0.25;
        } else if (annualSalary <= 2000000) {
            estimatedTax = 130000 + (annualSalary - 800000) * 0.30;
        } else if (annualSalary <= 8000000) {
            estimatedTax = 490 + (annualSalary - 2000000) * 0.32;
        } else {
            estimatedTax = 2410000 + (annualSalary - 8000000) * 0.35;
        }

        monthlyIncomeTax = estimatedTax / 12;

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String formattedMonthlyIncomeTax = decimalFormat.format(monthlyIncomeTax);

        JOptionPane.showMessageDialog(
                null,
                "Income: " + income + "\nEstimated Tax: " + formattedMonthlyIncomeTax
        );
    }
}
