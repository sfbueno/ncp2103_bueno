import javax.swing.JOptionPane;

public class Main {
    public static void main (String[]args){

        float subtotalBill;
        double totalBill, tipAmount, tipFinal, tipPercentage;


        subtotalBill = Float.parseFloat(JOptionPane.showInputDialog(null, " What is your Subtotal Bill"));
        tipPercentage = Integer.parseInt(JOptionPane.showInputDialog(null, " What is your tip Percentage:"));

        tipAmount = (tipPercentage / 100);
        tipFinal = (tipAmount * subtotalBill);
        totalBill = subtotalBill + tipFinal;



        JOptionPane.showMessageDialog(null, "Bill before tip: " + subtotalBill +
                "\nTip rate: %" + tipPercentage + "\nTip amount: " + tipFinal +
                "\nTotal Bill: "  + totalBill);





    }
}