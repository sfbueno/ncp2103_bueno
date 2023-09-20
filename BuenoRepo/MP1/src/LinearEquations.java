import javax.swing.*;

public class LinearEquations {

    public static void main(String[] args) {

        float a, b, c, d, e, f, x, y;

        a = Float.parseFloat(JOptionPane.showInputDialog(null, "Input a"));
        b = Float.parseFloat(JOptionPane.showInputDialog(null, "Input b"));
        c = Float.parseFloat(JOptionPane.showInputDialog(null, "Input c"));
        d = Float.parseFloat(JOptionPane.showInputDialog(null, "Input d"));
        e = Float.parseFloat(JOptionPane.showInputDialog(null, "Input e"));
        f = Float.parseFloat(JOptionPane.showInputDialog(null, "Input f"));

        x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        String resultMessage = "x is: " + x +
                "\ny is: " + y;

        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
