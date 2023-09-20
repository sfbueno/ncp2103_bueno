import javax.swing.JOptionPane;

public class HepHepHooray {
    public static void main(String[] args) {

        int result;

        result = Integer.parseInt(JOptionPane.showInputDialog(null, "Input your random number:"));

        if (result % 3 == 0 && result % 5 == 0) {
            JOptionPane.showMessageDialog(null,  "Your number: " + result + "\nHep-Hep, HOORAY!");
        }
        else if (result % 3 == 0) {
            JOptionPane.showMessageDialog(null, "Your number: " + result + "\nHep-Hep!");
        }
        else if (result % 5 == 0) {
            JOptionPane.showMessageDialog(null, "Your number: " + result + "\nHOORAY!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Oh not divisible by 3 & 5");
        }
    }
}
