import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class tuitionFee {
    public static void main(String[] args) {
        String increase = JOptionPane.showInputDialog(null, "Input your tuition fee increase rate (in percentage): ");
        String tuition = JOptionPane.showInputDialog(null, "Input your current tuition fee: ");
        String yearsInput = JOptionPane.showInputDialog(null, "Input the number of years: ");

        float increaseRate = Float.parseFloat(increase);
        float tuitionFee = Float.parseFloat(tuition);
        int yearsNum = Integer.parseInt(yearsInput);

        List<Float> tuitionFeeList = new ArrayList<>();

        if (increaseRate == 0) {
            JOptionPane.showMessageDialog(null, "There is no increase in your tuition fee.");
        } else {
            for (int year = 1; year <= yearsNum; year++) {
                tuitionFee += (increaseRate / 100) * tuitionFee;
                tuitionFeeList.add(tuitionFee); // Add the calculated tuition fee to the list
                JOptionPane.showMessageDialog(null, "Year " + year + ": The new tuition fee is " + tuitionFee);
            }
        }

        // Display the list of tuition fees
        StringBuilder resultMessage = new StringBuilder("Tuition Fee List:\n");
        for (int i = 0; i < tuitionFeeList.size(); i++) {
            resultMessage.append("Year ").append(i + 1).append(": ").append(tuitionFeeList.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, resultMessage.toString());
    }
}

