import javax.swing.JOptionPane;

public class TipCalculator {
    public static void main(String[] args){

        float  subtotalBill ;
        double tipAmount, totalBill;
        int tipPercentage;

        subtotalBill = Float.parseFloat(JOptionPane.showInputDialog(null, "Input your Bill  "));
        tipPercentage = Integer.parseInt(JOptionPane.showInputDialog(null, "Input your tip Percentage  "));

        tipAmount = (tipPercentage / 100.0) * subtotalBill;
        totalBill = subtotalBill + tipAmount;

        String resultMessage = "Tip Amount:  " + tipAmount +
                "\nTotal Bill:  " + totalBill;


        JOptionPane.showMessageDialog(null, resultMessage);


    }
}
