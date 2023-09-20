import javax.swing.JOptionPane;

public class HelloNameDialog
{
    public static void main(String[] args)
    {
        int length, width, area;
        float paintVolume;

        length = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Length"));
        width = Integer.parseInt(JOptionPane.showInputDialog(null, "Input Width"));

        area = length * width * 4 - 34;
        paintVolume = (float) area / 350;
        paintVolume = Math.round(paintVolume * 100.0f) / 100.0f;

        String resultMessage = "Length: " + length +
                "\nWidth: " + width +
                "\nArea: " + area +
                "\nPaint Volume: " + paintVolume;

        JOptionPane.showMessageDialog(null, resultMessage);
    }
}
