import javax.swing.JOptionPane;

public class Triangles {
    public static void main(String[] args) {
        String[] choices = {"By Sides", "By Angle"};
         int choice = JOptionPane.showOptionDialog(
                null,
                "Choose the method to determine the type of triangle:",
                "Triangle Type Classifier",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                choices,
                choices[0]
        );

        if (choice == 0) {
            classifyBySides();
        } else if (choice == 1) {
            classifyByAngle();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid choice. Please select 'By Sides' or 'By Angle'.");
        }
    }

    public static void classifyBySides() {
        double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 1:"));
        double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 2:"));
        double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of side 3:"));

        if (isValidTriangle(side1, side2, side3)) {
            if (side1 == side2 && side2 == side3) {
                JOptionPane.showMessageDialog(null, "Equilateral Triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                JOptionPane.showMessageDialog(null, "Isosceles Triangle");
            } else {
                JOptionPane.showMessageDialog(null, "Scalene Triangle");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Triangle");
        }
    }

    public static void classifyByAngle() {
        double angle1 = Double.parseDouble(JOptionPane.showInputDialog("Enter angle 1 in degrees:"));
        double angle2 = Double.parseDouble(JOptionPane.showInputDialog("Enter angle 2 in degrees:"));
        double angle3 = Double.parseDouble(JOptionPane.showInputDialog("Enter angle 3 in degrees:"));

        double sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles == 180) {
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                JOptionPane.showMessageDialog(null, "Acute Triangle");
            } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                JOptionPane.showMessageDialog(null, "Right Triangle");
            } else {
                JOptionPane.showMessageDialog(null, "Obtuse Triangle");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Triangle");
        }
    }

    public static boolean isValidTriangle(double side1, double side2, double side3) {
        return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
    }
}
