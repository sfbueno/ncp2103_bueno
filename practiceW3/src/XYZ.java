import javax.swing.JOptionPane;
public class XYZ {
    public static void main (String[]args){

        float distance, gallonPrice, totalCost, gasConsumption;

        distance = Float.parseFloat(JOptionPane.showInputDialog(null, "What is your total distance: "));
        gasConsumption = Integer.parseInt(JOptionPane.showInputDialog(null, " What is your gas consumption per km: "));
        gallonPrice = Float.parseFloat(JOptionPane.showInputDialog(null, " What is the price of your gas per gallon: "));

        totalCost = (distance / gasConsumption) * gallonPrice;

        JOptionPane.showMessageDialog(null,"Total Driving Cost :" + totalCost);


    }
}
