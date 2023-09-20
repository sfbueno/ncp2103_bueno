import javax.swing.JOptionPane;

public class DriverEfficiency {
    public static void main(String[] args) {

        float distance, kmPergallon, gallonPrice, totalCost;

        distance = Float.parseFloat(JOptionPane.showInputDialog(null, "Input your Total Distance:  "));
        kmPergallon = Float.parseFloat(JOptionPane.showInputDialog(null, "Input fuel consumption per KM:  "));
        gallonPrice = Float.parseFloat(JOptionPane.showInputDialog(null, "Input price per gallon:  "));

        totalCost = (distance / kmPergallon) * gallonPrice;

        String resultMessage = "Total driving distance:  " + distance +
                "\nKm per gallon:  " + kmPergallon +
                "\nGallon Price: " + gallonPrice +
                "\n------------------------------" +
                "\nTotal Travel Cost: " + totalCost;

        JOptionPane.showMessageDialog(null, resultMessage);
    }
    }
